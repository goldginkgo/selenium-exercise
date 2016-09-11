package com.example.selenium;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginStepdefs {
    private WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("^I open vodafone's website$")
    public void iOpenVodafoneSWebsite() throws Throwable {
        //Set implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.vodafone.co.nz/");
    }

    @And("^I click on My Vodafone in the top right corner menu$")
    public void iClickOnMyVodafoneInTheTopRightCornerMenu() throws Throwable {
        WebElement myVodafone = driver.findElement(By.linkText("My Vodafone"));
        myVodafone.click();
    }

    @And("^I click login on the next page$")
    public void iClickLoginOnTheNextPage() throws Throwable {
        WebElement login = driver.findElement(By.linkText("Login"));
        login.click();
    }

    @When("^I enter \"([^\"]*)\" as username and \"([^\"]*)\" as password in text box$")
    public void iEnterAsUsernameAndAsPasswordInTextBox(String username, String password) throws Throwable {
        //Enter username and password in textbox
        WebElement usernameTextBox = driver.findElement(By.id("myvfLoginOnlineId"));
        usernameTextBox.sendKeys(username);
        WebElement passowordTextBox = driver.findElement(By.id("myvfLoginPassword"));
        passowordTextBox.sendKeys(password);

        //Click on Sign in button
        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
        signInButton.click();
    }

    @Then("^I get a wrong message$")
    public void iGetAWrongMessages() throws Throwable {
        WebElement submitErrorElement = driver.findElement(By.className("submitError"));
        Assert.assertNotNull(submitErrorElement);
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
