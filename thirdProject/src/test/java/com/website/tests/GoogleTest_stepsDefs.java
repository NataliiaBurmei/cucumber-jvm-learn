package com.website.tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by nataliiaburmei on 09/08/15.
 */
public class GoogleTest_stepsDefs {

    String browser = "Chrome";

    //instantiate google page
    GooglePage User = new GooglePage(browser);

    @Given("^I am on website$")
    public void i_am_on_website() throws Throwable {
        User.OpenGoogleWebsite();

    }

    @When("^I search \"(.*)\"$")
    public void i_search_for(String arg1) throws Throwable {
        User.enterSearchValue(arg1);
        User.submitSearch();
    }

    @Then("^Google results page should be displayed$")
    public void google_results_page_should_be_displayed() throws Throwable {
        User.getSearchResult();
        User.closeBrowser();
    }
}
