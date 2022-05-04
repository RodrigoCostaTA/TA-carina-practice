package com.qaprosoft.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class SearchPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public SearchPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements( driver, this);
    }

    @FindBy(xpath = "//*[@id=\"center_column\"]/h1/span[2]")
    private WebElement searchResult;

    public String getSearchResult() {
        return searchResult.getText();
    }
}