package com.demo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class CommonHelpers {

    public static WebDriver loadWebDriver() {
        return loadWebDriver("chrome");
    }

    public static WebDriver loadWebDriver(String driverType) {
        String os = System.getProperty("os.name");
        if (driverType.equalsIgnoreCase("chrome") && os.equalsIgnoreCase("Windows")) {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");

        } else if (driverType.equalsIgnoreCase("chrome") && os.equalsIgnoreCase("Mac OS X")) {
            System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
        }

        HashMap<String, Object> macChromePref = new HashMap<>();
        macChromePref.put("profile.default_content_settings.popups", false);
        macChromePref.put("download.default_directory", "./src/test/resources/downloads");
        macChromePref.put("download.prompt_for_download", false);
        macChromePref.put("download.directory_upgrade", true);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", macChromePref);
        options.addArguments("disable-plugins");
        options.addArguments("disable-extensions");
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-infobars");
        options.addArguments("start-fullscreen");

        return new ChromeDriver(options);
    }


}
