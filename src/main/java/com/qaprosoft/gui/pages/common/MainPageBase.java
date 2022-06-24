package com.qaprosoft.gui.pages.common;

import com.qaprosoft.gui.pages.common.component.BlockTopMenuBase;
import org.openqa.selenium.WebDriver;

public abstract class MainPageBase extends BasicPageBase {

    public MainPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract SearchPageBase searchProduct(String productName);
    public abstract void hoverItem();
    public abstract ProductDetailsPageBase clickItem();

    public abstract BlockTopMenuBase getBlockTopMenu();

}