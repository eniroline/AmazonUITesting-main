package com.amazon.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoSuchElementException;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        // Launch Edge browser
        driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open Amazon homepage
        driver.get("https://www.amazon.com");

        // Check if "Continue shopping" button appears
        handleContinueShopping();
    }

    // ✅ Handle "Continue shopping" popup
    public void handleContinueShopping() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions
                    .elementToBeClickable(By.xpath("//input[@value='Continue shopping']")))
                .click();
            System.out.println("✅ Clicked 'Continue shopping' button");
            Thread.sleep(2000); // small delay after clicking
        } catch (NoSuchElementException e) {
            System.out.println("ℹ️ No 'Continue shopping' button found, continue test.");
        } catch (Exception e) {
            System.out.println("ℹ️ Continue shopping button not present, skipping...");
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // ✅ always close browser
            System.out.println("✅ Browser closed.");
        }
    }
}
