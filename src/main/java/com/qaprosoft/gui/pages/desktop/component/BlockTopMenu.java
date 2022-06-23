package com.qaprosoft.gui.pages.desktop.component;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.gui.pages.common.component.BlockTopMenuBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BlockTopMenuBase.class)
public class BlockTopMenu extends BlockTopMenuBase {

    public BlockTopMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text=\"Women\"]")
    private ExtendedWebElement womenTab;

    @FindBy(xpath = "//*[@text=\"Women\"]")
    private ExtendedWebElement dressesTab;

    @FindBy(xpath = "//*[@text=\"T-shirts\"]")
    private ExtendedWebElement tshirtsTab;

    @Override
    public void clickWomenTab() {
        womenTab.click();
    }

    @Override
    public void clickDressesTab() {
        dressesTab.click();
    }

    @Override
    public void clickTshirtsTab() {
        tshirtsTab.click();
    }
}
