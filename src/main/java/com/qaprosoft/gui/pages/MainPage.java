package com.qaprosoft.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class MainPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDetailProductModal(){
        return Utils.waitForElementPresence(
                driver,
                By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"),
                40
        );
    }

}
