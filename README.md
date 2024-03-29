# Project to demonstrate how to automate testing from a XML request-response flow using SOAPUI's Maven library along Java, Maven, Junit, Cucumber

Don't forget to give this project a ⭐

For this project, it was took into account the Windows as main environment! 

This project was created to start the initial steps with test automation for a SOAP Web Services using SOAP's Maven library. It tests the public WebService: [Number Converson](https://www.dataaccess.com/webservicesserver/NumberConversion.wso?wsdl). Which is a public SOAP Web Service, pretty simple to handle on and perform some requests.

The test scenario that I'm using here is to convert a number (two digits for example) into the number written, so that if you put '20' to convert to Dollars then the result will be 'twenty dollars'. The whole explanation is written in Medium's article: https://medium.com/@clarkewertonSilva. Please take a look.

## Project Structure
```bash
webservice-soapui-xml-java-junit-cucumber-automated-testing/
├─ src/
│  ├─ main/
│  │  ├─ java/
│  │  │  │  ├─ core/
│  │  │  │  │  ├─ BaseEndpoint.java
│  │  │  │  │  ├─ Endpoint.java
│  │  │  │  │  ├─ EndpointFactory.java
│  │  │  │  ├─ responseBody/
│  │  │  │  │  ├─ ResultHandlerWebservices.java
│  ├─ test/
│  │  ├─ java/
│  │  │  │  │  │  ├─ numberConversion/
│  │  │  │  │  │  │  ├─ builders/
│  │  │  │  │  │  │  |  ├─ NumberConversionBuilder.java
│  │  │  │  │  │  ├─ endpoints/
│  │  │  │  │  │  │  ├─ NumberToDollars.java
│  │  │  │  │  │  ├─ features/
│  │  │  │  │  │  │  |  ├─ numberConversion.feature
│  │  │  │  │  │  ├─ runner/
│  │  │  │  │  │  │  |  ├─ RunnerNumberConversion.java
│  │  │  │  │  │  ├─ steps/
│  │  │  │  │  │  │  |  ├─ NumberToDollars_Steps.java
│  │  ├─ resources/
│  │  │  ├─ soapui/
│  │  │  │  ├─ NumberConversion-soapui-project.xml
├─ .gitignore
├─ pom.xml
├─ README.md
```

## Languages and Frameworks

This project using the following languages and frameworks:

* [Java 8](https://openjdk.java.net/projects/jdk8/) as the programming language
* [JUnit 4](https://junit.org/junit4/) as the UnitTest framework to support the test creation
* [Cucumber](https://cucumber.io/) as the tool that supports Behaviour-Driven Development(BDD) making out tests more describable
* [Maven](https://maven.apache.org/) as the Java build tool
* [Eclipse](https://www.eclipse.org/) as the IDE
* [SOAPUI program](https://www.soapui.org/) as a way to create the XML's body templates and link it to the Maven's project afterwards.
* [SOAPUI's Maven library](https://www.soapui.org/docs/test-automation/maven/maven-2-x/) as the library for Maven to connect the programming logic to the SOAPUI's program installed in your machine. It's where all the testing automating truly happens.
* [XML Path](https://mvnrepository.com/artifact/io.rest-assured/xml-path/3.0.0) as the library from RestAssured to make the assertions in XML's body.


## How to run it?

All you have to do is run the class called 'RunnerNumberConversion' as a Junit test.

## Test architecture

We know that any automation project starting with a good test architecture.
You will see the following items in this architecture:

* [Patterns Applied](#page-objects-pattern)
* [Generate Report](#generate-report)

Do you have any other items to add to this test architecture? Please do a pull request or open an issue to discuss.

### Patterns Applied
* Abstract Factory Pattern
* Builder
* BaseEndpoint

### Generate Report
I'm using the Cluecumber Report Plugin to generate the reports, so after you run the Runner class using Junit4 or directly into Maven, then all you have to do is execute, at the project's root, the Maven command: mvn install

By doing so, the report will be generated because it's looking to the 'json' directory. Navigate into the project -> target -> cluecumber-report, then execute the file 'index.html'.
