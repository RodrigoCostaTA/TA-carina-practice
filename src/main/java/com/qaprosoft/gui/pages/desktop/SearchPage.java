package com.qaprosoft.gui.pages.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.gui.pages.common.SearchPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = SearchPageBase.class)
public class SearchPage extends SearchPageBase {

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement searchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchResult() {
        return searchResult.getText();
    }
}