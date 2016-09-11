package com.example.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"src/test/resources/com/example/selenium/"},
        monochrome=true
)
public class RunCukesTest {
}
