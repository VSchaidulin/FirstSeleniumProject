package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hw_13_FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
    }

    @Test
    public void hw_13_findElementByidTest(){
        driver.findElement(By.id("dialog-notifications-success"));



    }
    @Test
    public void hw_13_findElementByTegName(){
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println(body.isDisplayed());

    }
    @Test
    public void hw_13_findElementByClassName(){
        WebElement footer = driver.findElement(By.className("footer"));
        System.out.println(footer.isDisplayed());
    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
