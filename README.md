# Cucumber Automation Framework

## Description
This project is a Cucumber data-driven automation framework designed for testing web applications. It leverages Selenium for browser automation, Maven for project management, and Extent Reports for clear and concise test reporting.

## Features
- **Cucumber:** Enables Behavior-Driven Development (BDD) by writing test scenarios in a human-readable Gherkin format.
- **Selenium WebDriver:** Interacts with web browsers to automate UI testing.
- **Maven:** Manages project dependencies, build lifecycle, and project structure.
- **Extent Reports:** Generates detailed and visually appealing HTML reports of test execution.
- **Data-Driven:** Supports test execution with different sets of data.
- **Page Object Model (POM):** Promotes maintainable and reusable code by separating UI elements from test logic.

## Prerequisites
Before you begin, ensure you have the following software installed on your system:
- **Java Development Kit (JDK):** Version 8 or higher.
- **Apache Maven:** Version 3.5 or higher.
- **Web Browser:** Google Chrome, Mozilla Firefox, or any other browser supported by Selenium WebDriver.
- **Browser Drivers:** WebDriverManager is used in this project, which automatically downloads and manages the necessary browser drivers. Manual driver setup is no longer required.

## How to Run
1. **Clone the repository:**
   ```bash
   git clone <repository_url>
   cd <project_directory>
   ```
2. **Install dependencies:**
   Maven will automatically download all the project dependencies defined in the `pom.xml` file.
3. **Configure Test Data:**
   Test data can be managed in feature files directly or external files like Excel sheets (if implemented).
4. **Execute Tests:**
   Open a terminal or command prompt, navigate to the project root directory, and run the following Maven command:
   ```bash
   mvn clean test
   ```
   This command will compile the project, run all Cucumber tests found in `src/main/java/featurefiles`, and generate the Extent Report.

### Running Specific Features or Tags
You can control which features and tags are executed by passing system properties to Maven. The `cucumber.options` system property is used to pass command-line options to Cucumber.

**To run a specific feature file:**
   ```bash
   mvn test -Dcucumber.options="--features src/main/java/featurefiles/your_specific.feature"
   ```
   Replace `your_specific.feature` with the actual name of your feature file.

**To run tests with a specific tag:**
   ```bash
   mvn test -Dcucumber.options="--tags @YourTag"
   ```
   Replace `@YourTag` with the actual tag you want to execute.

**To run tests with multiple tags (e.g., @SmokeTest AND @RegressionTest):**
   This will run scenarios that have BOTH @SmokeTest AND @RegressionTest.
   ```bash
   mvn test -Dcucumber.options="--tags @SmokeTest --tags @RegressionTest"
   ```

**To run tests with multiple tags (e.g., @SmokeTest OR @RegressionTest):**
   This will run scenarios that have EITHER @SmokeTest OR @RegressionTest.
   ```bash
   mvn test -Dcucumber.options="--tags @SmokeTest,@RegressionTest"
   ```

**To run a specific feature file with a specific tag:**
   ```bash
   mvn test -Dcucumber.options="--features src/main/java/featurefiles/your_specific.feature --tags @YourTag"
   ```

## Reporting
After the test execution is complete, Extent Reports will be generated based on the path configured in `src/main/resources/config.properties` (default: `target/cucumber-extent-reports/report.html`).

Open the report file (e.g., `report.html`) in any web browser to view the detailed test execution report. The report includes information on:
- Overall test status (pass/fail/skipped)
- Individual scenario results
- Steps executed within each scenario
- Screenshots for failed steps (if configured)
- Execution time and environment details.

The `TestRunner.java` is configured to pick up features from `src/main/java/featurefiles` directory by default.
The `pom.xml` is configured with the `maven-surefire-plugin` to pass `cucumber.options` to the test execution environment.
