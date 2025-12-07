package com.amazon.stepdefinitions;

import com.amazon.pages.AmazonHomePage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class AmazonSteps {
    AmazonHomePage homePage;

    @Given("I am on the Amazon homepage")
    public void i_am_on_the_amazon_homepage() {
        homePage = new AmazonHomePage(Hooks.driver);  // ✅ use driver from Hooks
    }

    @When("I type {string} in the search box")
    public void i_type_in_the_search_box(String keyword) {
        homePage.enterSearchText(keyword);
    }

    @When("I click the search button")
    public void i_click_the_search_button() throws InterruptedException {
        homePage.clickSearchButton();
        Thread.sleep(2000);
    }

    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String keyword) {
        String title = homePage.getPageTitle();
        Assert.assertTrue(title.toLowerCase().contains(keyword.toLowerCase()),
                "Search results are not related to: " + keyword);
    }
}
