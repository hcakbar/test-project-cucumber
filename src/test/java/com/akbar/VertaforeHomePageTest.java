package com.akbar;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.akbar.utils.CommonHelpers.loadWebDriver;

public class VertaforeHomePageTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = loadWebDriver();
    }

    @After
    public void teardown() {
        driver.quit();
    }


    @Given("^I am on the Vertafore home page$")
    public void searchTest() {
        //Scenario: Finding Sircon for Carriers page
        //Given I am on the Vertafore home page
        //When I search for "Sircon for Carriers!"
        //Then the page should have at least one link with "Sircon for Carriers"

        driver.get("https://www.vertafore.com");
        driver.findElement(By.id("edit-keys")).click();
        driver.findElement(By.id("block-themekit-search")).sendKeys("Sircon for Carriers");

        Assert.assertTrue("Failed - searched link not found in search result", driver.findElement(By.linkText("Sircon for Carriers")).isDisplayed());
    }




}
