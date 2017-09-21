# Agro_Admin_Panel

This project is a integration of Selenium,TestNg,Maven, Extent Report and jenkins.

This project follows the Page Object Model.

### Steps to create Maven project:-
Step1:-Create a simple java project.
Step2:-right click on the project and configure it to maven project.
Step3:-go to pom.xml file.
Step4:-Add all the necessary dependencies to pom.xml file.
Step5:-now make java classes for each and every page web elements and 1 class for functionality of every class.
STep6:-now make 1 TestNg class write all the testcases in this class.

### How to make Extent Report of the project:-
* Add dependencies of extent report in pom.xml file.
* Now create object of ExtentReports and ExtentTest in testcase class.
* Give the path where you want to save your extent report.
* now Right click on project.
* Run as a Maven build..
* write "site" in goals field.
* click on run.


### Make Changes in code:-

1. please change the chrome driver path in System.setProperty() method in the class of BrowserFactory

2. Change the repository path in method ExtentReports() in @BeforeTest method in TestCase
