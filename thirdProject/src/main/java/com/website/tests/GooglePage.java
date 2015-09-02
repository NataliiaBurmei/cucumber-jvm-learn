package com.website.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.*;

/**
 * Created by nataliiaburmei on 09/08/15.
 */
public class GooglePage {

    String URL = "https://www.google.com";

    //formating link between browser and page
    //create constructor
    public GooglePage(String BS) {

        PageFactory.initElements(browserCore.driver(BS), this);
    }

    public void OpenGoogleWebsite() {
        browserCore.clearCache();
        browserCore.launchwebsite(URL);
    }

    public void enterSearchValue(String Value) {

        browserCore.driver.findElement(By.name("q")).sendKeys(Value);
    }

    public void submitSearch() {

        browserCore.driver.findElement(By.name("btnG")).click();
    }

    public void getSearchResult() {
        browserCore.driver.getTitle().contains("Google");
        //browserCore.driver.findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div[1]/div/h3/a")).isDisplayed();
    }
    public void closeBrowser()
    {

        browserCore.closewebsite();
    }
}
