package com.qaprosoft.gui.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartActions extends AbstractPage {

    public CartActions(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddToCartBtn() {
        return Utils.waitToBeClickable(
                driver,
                By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]"),
                30);
    }
}