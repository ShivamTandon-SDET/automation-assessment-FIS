package com.automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {
	public static ChromeOptions options ;  
	public static WebDriver createDriver() {
    	options = new ChromeOptions();
    	options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/114.0.0.0 Safari/537.36");

    	System.out.println("Inside createDriver");
        return new ChromeDriver(options);
    }
}
