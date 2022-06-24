package com.qaprosoft;
import com.qaprosoft.gui.pages.common.MainPageBase;
import com.qaprosoft.gui.pages.common.ProductDetailsPageBase;
import com.qaprosoft.gui.pages.common.SearchPageBase;
import com.qaprosoft.gui.pages.common.component.BlockTopMenuBase;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainPageTest extends BaseWebTest {

    MainPageBase mainPage = null;

    @BeforeSuite
    public void startDriver() {
        // Open GSM Arena home page and verify page is opened
        mainPage = initPage(MainPageBase.class);
        mainPage.open();
        Assert.assertTrue(mainPage.isPageOpened(), "Home page is not opened.");
    }

    @Test()
    public void itemsSearchFunctionality() {
        //Search for item
        SearchPageBase searchPageBase = mainPage.searchProduct("DRESS");
        Assert.assertTrue(searchPageBase.isPageOpened(), "Search page is not opened.");
    }

    @Test()
    public void blockTopMenuFunctionality() {

        BlockTopMenuBase blockTopMenuBase = mainPage.getBlockTopMenu();
        blockTopMenuBase.clickWomenTab();
        blockTopMenuBase.clickDressesTab();
        blockTopMenuBase.clickTshirtsTab();
    }

    @Test
    public void addRandomItemToCart(){
        ProductDetailsPageBase productDetailsPageBase = mainPage.clickItem();
    }
}