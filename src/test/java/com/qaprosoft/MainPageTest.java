package com.qaprosoft;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.gui.components.ProductItem;
import com.qaprosoft.gui.components.CartActions;
import com.qaprosoft.gui.pages.MainPage;
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
}