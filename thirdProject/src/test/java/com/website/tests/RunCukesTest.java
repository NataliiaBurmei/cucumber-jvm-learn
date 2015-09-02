package com.website.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by nataliiaburmei on 09/08/15.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        tags = {"@Run", "~@DontRun"},
        plugin = {"pretty", "html:target/html","json:target/cucumberJson/json", "junit:target/junit-report.xml"}
)
public class RunCukesTest {
}
