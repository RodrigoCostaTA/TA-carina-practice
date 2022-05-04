package com.qaprosoft.gui.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.gui.components.Category;
import com.qaprosoft.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandles;

public class MainPage extends AbstractPage {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements( driver, this);
    }

    public WebElement getDetailProductModal(){
        return Utils.waitForElementPresence(
                driver,
                By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2"),
                40
        );
    }
    public void closeDetailProductModal() {
        Utils.waitForElementPresence(
                driver,
                By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span"),
                40
        ).click();
    }

    @FindBy(id = "search_query_top")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
    private WebElement searchBtn;

    public void searchProduct(String productName) {
        searchField.sendKeys(productName);
        searchBtn.click();
    }

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    private WebElement womenTab;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    private WebElement dressesTab;

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    private WebElement tshirtsTab;

    public void clickWomenTab() {
        womenTab.click();
    }
    public void clickDressesTab() {
        dressesTab.click();
    }

    public void clickTshirtsTab() {
        tshirtsTab.click();
    }



}
