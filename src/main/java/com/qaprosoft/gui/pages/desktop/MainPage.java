package com.qaprosoft.gui.pages.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.gui.pages.common.MainPageBase;
import com.qaprosoft.gui.pages.common.ProductDetailsPageBase;
import com.qaprosoft.gui.pages.common.SearchPageBase;
import com.qaprosoft.gui.pages.common.component.BlockTopMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = MainPageBase.class)
public class MainPage extends MainPageBase {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "search_query_top")
    private ExtendedWebElement searchField;

    @FindBy(id = "searchbox")
    private ExtendedWebElement searchBtn;

    @FindBy(xpath = "//div[@class='product-container']")
    private ExtendedWebElement item;

    @Override
    public void hoverItem(){
        item.hover();
    }

    @Override
    public ProductDetailsPageBase clickItem() {
        item.click();
        return initPage(ProductDetailsPageBase.class);
    }

    @Override
    public SearchPageBase searchProduct(String productName) {
        searchField.type(productName);
        searchBtn.click();
        return initPage(SearchPageBase.class);
    }

    @Override
    public BlockTopMenuBase getBlockTopMenu(){
        return initPage(BlockTopMenuBase.class);
    }
}