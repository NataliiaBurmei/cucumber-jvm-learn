package com.website.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by nataliiaburmei on 09/08/15.
 */
public class browserCore {

    public static WebDriver driver;

    //constructor
    public browserCore() {

    }

    //defines method where user can select browser
    public static WebDriver driver(String browserSelection) {
        if (browserSelection.equals("Firefox")) {
            driver = new FirefoxDriver();
        }
        if (browserSelection.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
            driver = new ChromeDriver();
        }
        if (browserSelection.equals("HtmlUnit")) {
            driver = new HtmlUnitDriver();
        }
        return driver;
    }

    //redefining properties
    public static void launchwebsite(String url) {

        driver.navigate().to(url);
    }

    public static void closewebsite() {

        driver.close();
    }

    public static void clearCache()
    {

        driver.manage().deleteAllCookies();
    }

}