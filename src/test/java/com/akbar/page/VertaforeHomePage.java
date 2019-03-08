package com.akbar.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VertaforeHomePage {

    private WebDriver driver;
    private By searchIcon = By.id("block-themekit-search");
    private By searchField = By.id("edit-keys");

    public VertaforeHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void submitSearch(String searchString) {
        driver.findElement(searchIcon).click();
        driver.findElement(searchField).sendKeys(searchString);
    }


}
