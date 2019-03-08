package com.akbar.tests;

import com.akbar.page.CarrierHomePage;
import com.akbar.page.VertaforeHomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.akbar.utils.CommonHelpers.loadWebDriver;
import static org.junit.Assert.assertTrue;

public class CarrierHomePageSteps {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = loadWebDriver();
    }

    @After
    public void teardown() {
        driver.quit();
    }


    @Given("I am on the Vertafore home page")
    public void i_am_on_the_Vertafore_home_page() {
        driver.get("https://www.vertafore.com");
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        new VertaforeHomePage(driver).submitSearch("Sircon for Carriers");
    }

    @Then("the page should have at least one link with {string}")
    public void the_page_should_have_at_least_one_link_with(String string) {
        assertTrue("Failed - searched link not found in search result", new CarrierHomePage(driver).isPageDisplay());
    }


}
