package com.qaprosoft.gui.components;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class Category extends AbstractUIObject {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public Category(WebDriver driver) {
        super(driver);
        PageFactory.initElements( driver, this);
    }

    @FindBy(className = "category-name")
    private WebElement category;

    public String getCategoryName() {
        return category.getText();
    }
}
