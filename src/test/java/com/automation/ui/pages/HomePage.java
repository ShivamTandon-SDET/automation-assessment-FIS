package com.automation.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(name = "_nkw")
    WebElement searchBox;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void search(String keyword) {
        searchBox.sendKeys(keyword);
        searchBox.submit();
    }
}
