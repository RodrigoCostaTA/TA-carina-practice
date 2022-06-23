package com.qaprosoft.gui.pages.common.component;

import com.qaprosoft.gui.pages.common.BasicPageBase;
import org.openqa.selenium.WebDriver;

public abstract class BlockTopMenuBase extends BasicPageBase {

    public BlockTopMenuBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickWomenTab();
    public abstract void clickDressesTab();
    public abstract void clickTshirtsTab();
}
