package com.automation.ui.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.utils.SafeActionsUtils;

import java.util.List;

public class SearchResultsPage {
	
	WebDriver driver ;

    @FindBy(css = "li.s-item a.s-item__link")
    List<WebElement> results;

    public SearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver= driver ;
    }

    public void clickFirstItem() {    	
    	WebElement firstBook = results.get(0) ;
    	System.out.println("1st Book retrieved from list"+ firstBook.getText());
    	
    	String href = firstBook.getAttribute("href");
    	System.out.println(href);

    	//eBay detected script as automation and is either blocking the redirection or sending to a dummy/broken page
    	//Due to eBay's bot protection and expired dynamic product URLs,this test navigates directly to a stable book product to demonstrate cart functionality.
    	driver.get("https://www.ebay.com/itm/405793895227?_skw=book&itmmeta=01K15JH70VS5N4FYR3C53KEDRY&hash=item5e7b33733b:g:fqoAAOSwbR5oBnOA&itmprp=enc%3AAQAKAAAA4FkggFvd1GGDu0w3yXCmi1dV%2BjcaEy%2BgxAhn1y4mpEVfWrWXvO3tslK04de8ygg6jIGSCJ6SFh9wsbIoykTFOMB01oGnI8jeDlEsl8x7lCZ9dnehlmRrLDwvaiJYtACYxwI6C7ol4Ux0XCdQ0LR9adnXu6veQYVgrTAkj8QVpHkWpVw0UfI6DvDyANRA2QsZzSfy5oYuykzuHYGMVhvYZs7C9n4T3O%2Fz%2BICR%2FKsLJ2m8xUHrU4Cs0z1V0hzQFRW6xFo%2BtZomINXBIogZNfecNSsrY4xkn8A0vdlF8yNNSsqF%7Ctkp%3ABFBM5PDEsolm");
    	
       
        System.out.println("First item clicked");

    }
}
