package com.automation.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.SafeActionsUtils;

public class ProductPage {
    @FindBy(id = "atcBtn_btn_1")
    WebElement addToCart;
    
    @FindBy(xpath = "//button[@aria-label='Close overlay']")
    WebElement closeOverlay;

    @FindBy(className = "gh-badge")
    WebElement cartCount;

    WebDriver driver ;
    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }

    public void addToCart() {
        try {
    	addToCart.click();    	
    	SafeActionsUtils.waitForElementClickable(driver, closeOverlay, 6) ;
        closeOverlay.click();
        System.out.println("overlay closed");
        }
        catch (Exception e) {
        	System.out.println("some issue in add to card or closing the overlay");
        }
    }

    public boolean isCartUpdated() {
        try {
        	System.out.println("inside isCartupdated");
        	
        	Thread.sleep(2000);
        	SafeActionsUtils.scrollIntoView(driver, cartCount);
        	System.out.println("Products inside cart: "+cartCount.getText());
            return Integer.parseInt(cartCount.getText()) > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
