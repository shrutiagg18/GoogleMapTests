About the framework:
The framework is implemented using Cucumber, PageObject, Maven, TestNG, Listeners, Screenshots, ExtentReporting, PropertiesData Input, baseclass, FirefoxAndChromeExecution (In order to run in Firefox or Chrome, go to "src/main/java/resources/data.properties" and change the value to "firefox" or "chrome")
File Name: TestScenario.Feature uses Gherkin so that the test case is easily understandable by all.

Reports:
FolderName: 
1) reports/index.html
or
2) surefire-reports/index.html
How To Run The TestCases:
Import the project in Eclipse(or others), go to "pom.xml" and run as "Maven Test"


Things that can be improved:
1) Reporting by implementing Extent reports in detailed way
2) Methods can be more generalized
3) Test cases can be more organised
4) Test Cases and TestSuite can be created and can be run using Jenkins
