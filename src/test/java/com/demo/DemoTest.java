package com.demo;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static com.demo.utils.CommonHelpers.loadWebDriver;

public class DemoTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = loadWebDriver();
    }

    @After
    public void teardown() {
        driver.quit();
    }

    @Test
    public void blah() {
        driver = loadWebDriver();
        driver.get("https://www.vertafore.com");
    }

    @Given("^I am on the Google search page$")
    public void demoTest() {
        driver.get("http://www.google.com");
    }

}
