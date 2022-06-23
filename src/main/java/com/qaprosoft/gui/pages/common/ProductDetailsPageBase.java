package com.qaprosoft.gui.pages.common;

import org.openqa.selenium.WebDriver;

public abstract class ProductDetailsPageBase extends BasicPageBase {

    public ProductDetailsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void addItemToCart();
}
