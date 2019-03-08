package com.akbar.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrierHomePage {
    private WebDriver driver;
    private By carrierPageLink = By.linkText("Sircon for Carriers");

    public CarrierHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isPageDisplay() {
        return driver.findElement(carrierPageLink).isDisplayed();
    }


}
