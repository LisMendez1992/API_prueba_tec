# API Test Automation

## Prerequisites

1. [Maven](https://maven.apache.org/download.cgi)
2. [Allure reports](https://docs.qameta.io/allure/#_installing_a_commandline)

## How to Run Tests from the Command Line (for macOS):

To run the automated tests from the command line on macOS, follow these steps:

1. Open a terminal window.

2. Navigate to the project directory where the tests are located.

3. Execute the following Maven command to run the tests:

   ```shell
   mvn test -DxmlFilePath=<path-to-testng-xml>

# Allure Reports

This repository is configured to generate Allure reports for your test results.

## Usage

To generate an Allure report, follow these steps:

1. Make sure you have Allure installed on your system. 

2. Run the test suite, which should generate Allure report data.

3. After running your tests, you should see a folder named allure-results generated in your project directory. This folder contains the raw data for the Allure report.

4. To view the Allure report, use the following command:
   ```shell
   allure serve allure-results

