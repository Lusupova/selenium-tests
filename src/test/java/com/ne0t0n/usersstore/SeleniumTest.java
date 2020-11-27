package com.ne0t0n.usersstore;

import org.aspectj.lang.annotation.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

public class SeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void preCondition(){
        System.setProperty("webdriver.chrome.driver","/Users/rustemyusupov/Documents/LudaDocs/chromedriver");
         driver = new ChromeDriver();
         driver.get("http://localhost:8890/");
    }

    @Test
    public void openApp(){

        WebElement userName = driver.findElement(By.id("nameField"));
        userName.sendKeys("Test");
        WebElement age = driver.findElement(By.id("ageField"));
        age.sendKeys("21");
        WebElement addUserButton = driver.findElement(By.cssSelector("#content > div:nth-child(1) > form > button"));
        addUserButton.click();
    }

    @AfterClass
    public void postCondition(){
        driver.quit();
    }
}
