package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumTest {
    private static final Logger logger = LoggerFactory.getLogger(SeleniumTest.class);
    public static void main(String[] args) {
        logger.info("This is an INFO log");

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the title
        System.out.println("Page title is: " + driver.getTitle());

        // Close the browser
        driver.quit();
        logger.error("This is a log after driver quit");
    }
}
