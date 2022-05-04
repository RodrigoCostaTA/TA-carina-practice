package com.qaprosoft.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class ProductItem extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @FindBy(xpath = "//a[contains(@class, 'product-name')]")
    private ExtendedWebElement item;

    public ProductItem(WebDriver driver) {
        super(driver);
    }

    public String readProductName() {
        return item.getText();
    }

    public void hover() {
        item.hover();
    }
}
