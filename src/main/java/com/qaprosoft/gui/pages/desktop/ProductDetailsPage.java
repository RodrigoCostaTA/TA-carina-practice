package com.qaprosoft.gui.pages.desktop;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.gui.pages.common.ProductDetailsPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ProductDetailsPageBase.class)
public class ProductDetailsPage extends ProductDetailsPageBase {

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add_to_cart")
    private ExtendedWebElement addToCartBtn;

    @FindBy(id = "layer_cart")
    private ExtendedWebElement productAddedToCartDetails;

    @Override
    public void addItemToCart(){
        addToCartBtn.click();
    }


}
