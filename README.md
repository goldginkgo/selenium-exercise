# Java Cucumber Selenium Project

## Requirements
Write a Cucumber/Java project that illustrates your proficiency in using BDD with Selenium.

1. go to http://www.vodafone.co.nz/ 
2. click on My Vodafone in the top right corner menu 
3. on the next page (should be http://www.vodafone.co.nz/using-myvodafone/) click Login 
4. on the Login page, enter wrong username and password (so something random basically) and check the login is wrong 

## Running the application
1.Import selenium-exercise as a Maven project in IDE(e.g. Intellij IDEA).

2.Download ChromeDriver from the following URL, unzip and put chromedriver.exe to the root folder of selenium-exercise.
http://chromedriver.storage.googleapis.com/index.html?path=2.24/

3.Run com.example.selenium.RunLoginTest. Cucumber test reports are located in the report directory of the root folder.

## Design notes
- Used Cucumber and Selenium for browser automation in BDD.
- Used cucumber-reports for pretty Cucumber HTML reports.
- Defined a Browser class to encapsulate Selenium WebDriver API.
- Defined reusable step definitions through step arguments.
- Developed a “Mapping” class to define the relationships between web element name and id. And test the class with JUnit.
