package com.example.selenium;

import com.example.mapping.Mapping;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.WebElement;


public class LoginStepdefs {
    private Browser browser = new Browser();

    @Before
    public void setup() {
        this.browser.windowMaxmize();
    }

    @Given("^I visit url \"([^\"]*)\"$")
    public void iVisitUrl(String url) throws Throwable {
        this.browser.openURL(url);
    }

    @Then("^I should be navigated to \"([^\"]*)\"$")
    public void iShouldBeNavigatedTo(String url) throws Throwable {
        String currentURL = this.browser.getCurrentURL();
        Assert.assertEquals(url, currentURL);
    }

    @When("^I click \"([^\"]*)\" link$")
    public void iClickLink(String text) throws Throwable {
        WebElement element = this.browser.findElementByLinkText(text);
        this.browser.click(element);
    }

    @When("^I enter \"([^\"]*)\" in \"([^\"]*)\" input field$")
    public void iEnterInInputField(String text, String textFieldName) throws Throwable {
        String elementId = Mapping.getMapping(this.browser.getCurrentURL(), textFieldName);
        WebElement textFieldElement = this.browser.findElementByElementId(elementId);
        this.browser.sendKeys(textFieldElement, text);
    }

    @When("^I click \"([^\"]*)\" button$")
    public void iClickButton(String buttonName) throws Throwable {
        String elementId = Mapping.getMapping(this.browser.getCurrentURL(), buttonName);
        WebElement signInButton = this.browser.findElementByElementId(elementId);
        this.browser.click(signInButton);
    }

    @Then("^I should get a wrong message \"([^\"]*)\"$")
    public void iShouldGetAWrongMessage(String message) throws Throwable {
        WebElement submitErrorElement = this.browser.findElementByClassName("submitError");
        Assert.assertNotNull(submitErrorElement);
        String errorMessage = submitErrorElement.getText();
        Assert.assertEquals(message, errorMessage);
    }

    @After
    public void closeBrowser() {
        this.browser.quitBrowser();
    }

}
