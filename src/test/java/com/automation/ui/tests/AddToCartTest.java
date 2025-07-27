package com.automation.ui.tests;

import com.automation.ui.base.BaseTest;
import com.automation.ui.pages.HomePage;
import com.automation.ui.pages.ProductPage;
import com.automation.ui.pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyItemCanBeAddedToCart() {
        driver.get("https://www.ebay.com");

        HomePage home = new HomePage(driver);
        home.search("book");

        SearchResultsPage results = new SearchResultsPage(driver);
    	
        System.out.println("SearchResultsPage initialized");

        results.clickFirstItem();
    	

        ProductPage product = new ProductPage(driver);
    	System.out.println("ProductPage initialized");

        product.addToCart();

        Assert.assertTrue(product.isCartUpdated(), "Cart should be updated");
    }
}
