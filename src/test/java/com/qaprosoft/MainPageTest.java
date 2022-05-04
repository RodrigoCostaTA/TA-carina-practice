package com.qaprosoft;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.gui.components.Category;
import com.qaprosoft.gui.components.ProductItem;
import com.qaprosoft.gui.components.CartActions;
import com.qaprosoft.gui.pages.MainPage;
import com.qaprosoft.gui.pages.SearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainPageTest implements IAbstractTest {

    CartActions cartActions = new CartActions(getDriver());

    @Test()
    public void AddItemToCart() {

        MainPage mainPage = new MainPage(getDriver());
        mainPage.open();
        Assert.assertTrue(mainPage.isPageOpened(), "Home page is not opened");

        //Hover a product item
        ProductItem item = new ProductItem(getDriver());
        item.hover();

        //Add item to cart
        cartActions.getAddToCartBtn().click();

        //Get details product message
        String message = mainPage.getDetailProductModal().getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(message,"Product successfully added to your shopping cart");
        softAssert.assertAll();
    }
    @Test()
    public void ItemsSearchFunctionality() {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.open();
        //Search for item
        mainPage.searchProduct("dress");

        SearchPage searchPage = new SearchPage(getDriver());

        String message = searchPage.getSearchResult();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(message,"7 results have been found.");
        softAssert.assertAll();
    }
    @Test()
    public void topMenuFunctionality() {
        MainPage mainPage = new MainPage(getDriver());
        mainPage.open();
        Category category = new Category(getDriver());
        SoftAssert softAssert = new SoftAssert();
        String message;

        mainPage.clickWomenTab();
        softAssert.assertEquals (message = category.getCategoryName(), "Women");

        mainPage.clickDressesTab();
        softAssert.assertEquals (message = category.getCategoryName(), "Dresses");

        mainPage.clickTshirtsTab();
        softAssert.assertEquals (message = category.getCategoryName(), "T-shirts");
        softAssert.assertAll();
    }
}