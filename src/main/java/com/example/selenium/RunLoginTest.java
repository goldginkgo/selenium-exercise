package com.example.selenium;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "report/cucumber.json",
        detailedReport = true,
        overviewReport = true,
        outputFolder = "report")
@CucumberOptions(
        plugin = {"json:report/cucumber.json"},
        tags = {"@login"},
        features = { "src/main/resources/com/example/selenium" })
public class RunLoginTest {

}
