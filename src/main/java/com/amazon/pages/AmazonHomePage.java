package com.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonHomePage {
    WebDriver driver;

    // Locators
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    // Constructor
    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterSearchText(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
    }

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
