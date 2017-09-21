# Agro_Admin_Panel

This project is a integration of Selenium,TestNg,Maven, Extent Report and jenkins.

This project follows the Page Object Model.

### Steps to create Maven project:-
* Create a simple java project.
* right click on the project and configure it to maven project.
* go to pom.xml file.
* Add all the necessary dependencies to pom.xml file.
* now make java classes for each and every page web elements and 1 class for functionality of every class.
* now make 1 TestNg class write all the testcases in this class.

### How to make Extent Report of the project:-
* Add dependencies of extent report in pom.xml file.
* Now create object of ExtentReports and ExtentTest in testcase class.
* Give the path where you want to save your extent report.
* now Right click on project.
* Run as a Maven build..
* write "site" in goals field.
* click on run.

### How to run project in jenkins:-
* Right click on project and click on Export.
* Search for runnable JAR files.
* Click on next and browse your path where you want to save your JAR file.
* now go to jenkins and login in jenkins.
* Create new item and make a free style project.
* Click on Build now now your project is created in workspace of jenkins.(var/lib/jenkins/workspace/projectname)
* now copy your jar file to this project folder.
* now go to jenkin project, click on configure and go to Build option select Execute shell.
* write a command-java -jar /var/lib/jenkins/workspace/projectname/yourjarfile.jar.
* now click on build now option and check console output.


### Make Changes in code:-

1. please change the chrome driver path in System.setProperty() method in the class of BrowserFactory

2. Change the repository path in method ExtentReports() in @BeforeTest method in TestCase
