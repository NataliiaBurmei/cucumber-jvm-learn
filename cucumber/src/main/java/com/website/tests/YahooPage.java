package com.website.tests;

import cucumber.api.java.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by nataliiaburmei on 09/08/15.
 */
public class YahooPage {
    public YahooPage(){

        PageFactory.initElements(browserCore.driver("Chrome"),this);
    }
    public void openYahooNews(String Url)
    {
        browserCore.clearCache();
        browserCore.launchwebsite(Url);
    }
    public void enterSearchNewsValue(String Value)
    {

        browserCore.driver.findElement(By.name("p")).sendKeys(Value);
    }
    public void submitSearch()
    {

        browserCore.driver.findElement(By.className("yucs-sweb-btn")).click();
    }

    @Test
    public boolean verification(String checkvalue)
    {
        System.out.println("The title of the page: " + browserCore.driver.getTitle());

        assertTrue(browserCore.driver.getTitle().contains(checkvalue));
        return Boolean.parseBoolean(checkvalue);
    }

    @After
    public void tearDown()
    {
        browserCore.closewebsite();
    }
}
