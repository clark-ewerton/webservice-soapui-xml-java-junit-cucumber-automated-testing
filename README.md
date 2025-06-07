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
│  │  │  │  │  │  ├─ runner/
│  │  │  │  │  │  │  |  ├─ RunnerNumberConversion.java
│  │  │  │  │  │  ├─ steps/
│  │  │  │  │  │  │  |  ├─ NumberToDollars_Steps.java
│  │  ├─ resources/
│  │  │  ├─ numberConversion/features
│  │  │  │  ├─ numberConversion.feature
│  │  │  ├─ soapui/
│  │  │  │  ├─ NumberConversion-soapui-project.xml
│  │  │  ├─ allure.properties
├─ .gitignore
├─ pom.xml
├─ README.md
```

## Languages and Frameworks

This project using the following languages and frameworks:

* [Java 24](https://openjdk.java.net/projects/jdk24/) as the programming language
* [JUnit 5](https://junit.org/junit5/) as the UnitTest framework to support the test creation
* [Cucumber](https://cucumber.io/) as the tool that supports Behaviour-Driven Development(BDD) making out tests more describable
* [Maven](https://maven.apache.org/) as the Java build tool
* [SOAPUI program](https://www.soapui.org/) as a way to create the XML's body templates and link it to the Maven's project afterwards.
* [SOAPUI's Maven library](https://www.soapui.org/docs/test-automation/maven/maven-2-x/) as the library for Maven to connect the programming logic to the SOAPUI's program installed in your machine. It's where all the testing automating truly happens.
* [XML Path](https://mvnrepository.com/artifact/io.rest-assured/xml-path/3.0.0) as the library from RestAssured to make the assertions in XML's body.
* [Allure Reports](https://mvnrepository.com/artifact/io.rest-assured/xml-path/3.0.0](https://allurereport.org/) as the main report

## How to run it?

All you have to do is run the class called 'RunnerNumberConversion' as a Junit test. Or you can just run as a maven using the command: mvn test

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

## GitHub Actions CI/CD
The workflow file `.github/workflows/cicd.yml` includes two jobs:

`run-api-tests`: runs tests on a local emulator on GitHub-hosted runners using Ubuntu.

`deploy-report`: generates an Allure report and publishes it to GitHub Pages.

Allure results are stored as artifacts and published after every execution, regardless of test results.

## Allure Reports
After every test execution, Allure reports are generated and published to:

🔗 https://clark-ewerton.github.io/webservice-soapui-xml-java-junit-cucumber-automated-testing

## Contributing
Contributions are welcome!
Feel free to open issues, fork the repository, and submit pull requests.

If you find this project useful, please consider giving it a star to help increase its visibility.

## License
This project is licensed under the MIT License.
See the LICENSE file for more details.
