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
- **Browser Drivers:** Corresponding WebDriver executables for your chosen browser (e.g., ChromeDriver, GeckoDriver). Ensure these are added to your system's PATH.

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
   This command will compile the project, run the Cucumber tests, and generate the Extent Report.

## Reporting
After the test execution is complete, Extent Reports will be generated in the following directory:
`target/cucumber-reports/extent-report.html`

Open the `extent-report.html` file in any web browser to view the detailed test execution report. The report includes information on:
- Overall test status (pass/fail/skipped)
- Individual scenario results
- Steps executed within each scenario
- Screenshots for failed steps (if configured)
- Execution time and environment details.
