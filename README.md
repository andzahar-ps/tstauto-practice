# Getting started with Serenity

Serenity BDD is a library that makes it easier to write high quality automated acceptance tests, with powerful reporting and living documentation features. It has strong support for both web testing with Selenium, and API testing using RestAssured.

Serenity strongly encourages good test automation design, and supports several design patterns, including classic Page Objects, the newer Lean Page Objects/ Action Classes approach

### The project directory structure
The project has build scripts for Maven, and follows the standard directory structure used in most Serenity projects:
```Gherkin
src
  + test
    + java                        Test runners and supporting
        + keywords                Glue code to compose Gherkin tests, the keywords are created from @steps
        + steps                   Reusable steps that are created from page objects
        + pages                   Standard page object
        + util                    Utility package for utility classes
    + resources
        + features                  Feature files
            + authentication          Epic
                + login.feature        Feature
        + webdriver                 Bundled webdriver binaries
            + linux
            + mac
            + windows 
                + chromedriver.exe       OS-specific Webdriver binaries 

```

## The sample scenarios
One positive and one negative for logging in into a website

```Gherkin
Feature: As a user I can login successfully or not depending on the validity of my credentials

  @ui @login
  Scenario: Entering valid credentials the user is able to login and see 'Dashboard' bar
    Given that the user's browser is opened the login page
    When the user logs with valid credentials
    Then the user sees login error message


  @ui @login
  Scenario: Entering invalid credentials the user is not able to login and sees error message
    Given that the user's browser is opened the login page
    When the user logs with invalid credentials
    Then the user sees login success message
```


The glue code for the positive scenario looks like this

```java
    @Given("that the user's browser is opened the login page")
       public void open_browser_at_login_page() {
           loginSteps.navigate_to_login_page();
       }

    @When("the user logs with valid credentials")
        public void log_in_user_with_valid_credentials() {
            loginSteps.login_with_username_and_password(TestConstant.VALID_USER_USERNAME, TestConstant.VALID_USER_PASSWORD);
       }

    @Then("the user sees login success message")
        public void assert_login_success_message() {
            loginSteps.assert_login_message(TestConstant.MESSAGE_SUCCESS_LOGIN);
        }
```

### Lean Page Objects and Action Classes
The glue code shown above uses Serenity step libraries as _action classes_ to make the tests easier to read, and to improve maintainability.

These classes are declared using the Serenity `@Steps` annotation, shown below:
```java
    @Steps
    LoginPage loginPage;

```

The `@Steps`annotation tells Serenity to create a new instance of the class, and inject any other steps or page objects that this instance might need.

## Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run either `mvn verify` from the command line.

By default, the tests will run using Chrome. You can run them in Firefox by overriding the `driver` system property, e.g.
```json
$ mvn clean verify -Ddriver=firefox
```

The test results will be recorded in the `target/site/serenity` directory.

## Simplified WebDriver configuration and other Serenity extras
The sample projects both use some Serenity features which make configuring the tests easier. In particular, Serenity uses the `serenity.conf` file in the `src/test/resources` directory to configure test execution options.
### Webdriver configuration
The WebDriver configuration is managed entirely from this file, as illustrated below:
```java
webdriver {
    driver = chrome
}
headless.mode = true

chrome.switches="""--start-maximized;--test-type;--no-sandbox;--ignore-certificate-errors;
                   --disable-popup-blocking;--disable-default-apps;--disable-extensions-file-access-check;
                   --incognito;--disable-infobars,--disable-gpu"""

```

The project also bundles some of the WebDriver binaries that you need to run Selenium tests in the `src/test/resources/webdriver` directories. These binaries are configured in the `drivers` section of the `serenity.conf` config file:
```json
drivers {
  windows {
    webdriver.chrome.driver = "src/test/resources/webdriver/windows/chromedriver.exe"
    webdriver.gecko.driver = "src/test/resources/webdriver/windows/geckodriver.exe"
  }
  mac {
    webdriver.chrome.driver = "src/test/resources/webdriver/mac/chromedriver"
    webdriver.gecko.driver = "src/test/resources/webdriver/mac/geckodriver"
  }
  linux {
    webdriver.chrome.driver = "src/test/resources/webdriver/linux/chromedriver"
    webdriver.gecko.driver = "src/test/resources/webdriver/linux/geckodriver"
  }
}
```
This configuration means that development machines and build servers do not need to have a particular version of the WebDriver drivers installed for the tests to run correctly.

### Environment-specific configurations
We can also configure environment-specific properties and options, so that the tests can be run in different environments. Here, we configure three environments, dev, test, with different starting URLs for each:
```json
environments {
  default {
    webdriver.base.url = "http://the-internet.herokuapp.com/"
    login.page = "http://the-internet.herokuapp.com/login"
  }
  dev {
    webdriver.base.url = "http://the-internet.herokuapp.com/"
    login.url = "http://the-internet.herokuapp.com/login"
  }
  test {
    webdriver.base.url = "http://the-internet.herokuapp.com/"
    login.url = "http://the-internet.herokuapp.com/login"
  }
}
```

You use the `environment` system property to determine which environment to run against. For example to run the tests in the test environment, you could run:
```json
$ mvn clean verify -Denvironment=test
```

You use the `cucumber.options alongisde --tags` system property to determine which tests to run. For example to run tests that have the @ui label, you could run:
```json
$ mvn clean verify -Dcucumber.options="--tags @ui"
```
You use the `serenity:aggregate' to aggregate tests results. For example to run tests and generate report and the end of the execution, you could run:
```json
$ mvn clean verify serenity:aggregate -Dcucumber.options="--tags @ui"
```