# cucumber-jvm-learn 
## Project stack
- Java JDK
- Intellij IDE
- Maven
- Cucumber and Gherkin plugins

#### Intellij set up
Enable the following pugins in Intellij ->Preferences ->Plugins ->Plugins search
- Maven integration
- Cucumber for Java
- Gherkin

#### Maven set up
- Download Maven binary from
http://maven.apache.org/download.cgi
- Configure Maven in the System Variable as “%MAVEN_HOME%\bin”
- manage dependancies in pom.xml

#### Cucumber set up
Write down dependancies into pom.xml for Cucumber test framework
 - Cucumber-Core ==> Cucumber runner 
 - Cucumber-JUnit ==> Given, When, Then
 - JUnit ==> test runner

##### Cucumber dependancies should look like
```
<dependencies>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>1.2.4</version>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>1.2.4</version>
        </dependency>
        <dependency>
            <groupId>info.cukes</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>1.2.4</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>2.47.1</version>
        </dependency>
    </dependencies>
```

#### Test Runner
RunCukes is a test runer class which executes Cucumber tests
- Add RunCukes under Java folder
- This class is also added under the Java folder.
```
@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/resources/“)
public class RunCukes {
}
```
@RunWith is a JUit runner
@CucumberOptions is feature location

#### Reporting

- Add plugin under @CucumberOptoins
```
plugin = {"pretty", "html:target/html", "json:target/cucumberJson/json", "junit:target/junit-report.xml"}
```
