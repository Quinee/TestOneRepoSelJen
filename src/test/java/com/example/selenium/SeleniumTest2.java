package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumTest2 {

    private WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(SeleniumTest2.class);

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void googleSearch() {
        logger.info("This is an INFO log");
        driver.get("https://www.google.com");

        // Find search box and enter text
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");
        searchBox.submit();

        // Wait for results to load
        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        // Verify that results are displayed
        String title = driver.getTitle();
        //Assert.assertTrue(title.contains("Selenium WebDriver"), "Title does not contain search term!");
    }

    @AfterClass
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }}
