package com.website.tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import junit.framework.Assert;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by nataliiaburmei on 09/08/15.
 */
public class YahooTest_stepDefs {

    YahooPage User = new YahooPage();

    @Given("^I am on Yahoo on Yahoo news website$")
    public void i_am_on_Yahoo_on_Yahoo_news_website() throws Throwable {

        User.openYahooNews("https://uk.news.yahoo.com/");
    }

    @When("^I search (.*)$")
    public void i_search(String value) throws Throwable {
        User.enterSearchNewsValue(value);
        User.submitSearch();
    }

    @Then("^I should get the health  news$")
    public void i_should_get_the_health_news() throws Throwable {
        User.verification("Yahoo");
    }
}