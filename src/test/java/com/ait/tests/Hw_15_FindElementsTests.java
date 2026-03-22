package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Hw_15_FindElementsTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
    }
    @Test
    public void hw_15_findElementByText(){
        WebElement linkText1 = driver.findElement(By.linkText("Addresses"));
        System.out.println(linkText1.getText());

        WebElement linkText2 = driver.findElement(By.linkText("Blog"));
        System.out.println(linkText2.getText());

        WebElement linkText3 = driver.findElement(By.linkText("Privacy Notice"));
        System.out.println(linkText3.getText());
    }
    @Test
    public void hw_15_findElementByPartialLinkText(){
        WebElement partialLinkText = driver.findElement(By.partialLinkText("Notice"));
        System.out.println(partialLinkText.getText());
    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }

}
