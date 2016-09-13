package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {
    private WebDriver driver = new ChromeDriver();

    public void windowMaxmize() {
        this.driver.manage().window().maximize();
    }

    public void openURL(String url) {
        //Set implicit wait of 10 seconds
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.get(url);
    }

    public String getCurrentURL() {
        return this.driver.getCurrentUrl();
    }

    public WebElement findElementByLinkText (String linkText) {
        return this.driver.findElement(By.linkText(linkText));
    }

    public WebElement findElementByElementId (String elementId) {
        return this.driver.findElement(By.id(elementId));
    }

    public WebElement findElementByElementName (String elementName) {
        return this.driver.findElement(By.name(elementName));
    }

    public WebElement findElementByClassName (String className) {
        return this.driver.findElement(By.className(className));
    }

    public void click(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void quitBrowser() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
