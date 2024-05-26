
**Campaign Scheduling Feature Testing**

This repository contains automated test scripts and detailed test plans for testing the Campaign Scheduling feature.

**Test Plans**


    Milestone 1: Functional Test Plan

        Detailed test plan covering all functional aspects of the Campaign Scheduling feature.
        File: functional-test-plan.md

    Milestone 2: Integration Test Plan

        Detailed test plan focusing on the integration of the Campaign Scheduling service with other services.
        File: integration-test-plan.md

    Milestone 3: UI Test Plan

        Test plan to create automated UI tests to ensure the Campaign Scheduling feature is user-friendly and works across different devices.
        File: ui-test-plan.md

**Automated Test Scripts**

    Milestone 4: Functional Test Scripts

        Automated functional test scripts for the Campaign Scheduling feature.
        Language: Java
        Framework: Selenium WebDriver
        Directory: functional-tests.

        Automated UI Test Scripts
            Automated AutomatedUI test scripts for the Campaign Scheduling feature.
            Language: Java
            Framework: Selenium WebDriver
            Directory: automated-ui-test

    Milestone 5: Integration Test Scripts

        Automated integration test scripts for the integration of the Campaign Scheduling service with recipient management and email template services.
        Language: Java
        Framework: JUnit with Mockito
        Directory: integration-tests

**Running the Tests**

    **Prerequisites**
        Ensure you have Java installed on your system.
        Set up the Selenium WebDriver and JUnit dependencies in your project for running the automated tests.

        **Method 1:**

            1. Setting Up the Shell Script
                Created a run-tests.sh script in the root directory of the project. This script will handle building the project, running tests, and setting up mock APIs.
            
                Make sure the script is executable by running: chmod +x run-tests.sh

            2. Docker Compose for Mock APIs
                Created a docker-compose.yml file in the root directory to set up mock API services using Docker.

            3. Setting Up Mock API Initialization
                Create the following directory structure for mock API configurations:

                mock-apis/
                ├── email-templates/
                │   └── init.json
                └── recipients/
                    └── init.json

            4. Running the Tests
                With everything set up, you can run all tests by executing the run-tests.sh script:./run-tests.sh

                **This script will:**

                    Build the project using Maven.
                    Start the mock API services using Docker Compose.
                    Run the functional tests.
                    Run the automated UI tests.
                    Run the integration tests.
                    Stop the mock API services after the tests are done.

            **Notes**
            **MockServer Initialization: The mock server initialization JSON files should be customized according to the actual endpoints and data structures used in your project.
            Docker Compose: Ensure Docker and Docker Compose are installed and running on your system.
            TestNG Configuration: Make sure your testng.xml file is correctly set up to include all the test classes and groups you intend to run.**

        **Method 2:**

            To execute the above script using the pom.xml file and leverage the testng.xml file for running the tests, i have utilize Maven's exec-maven-plugin to run the shell script and the maven-surefire-plugin to execute the tests specified in the testng.xml

            Steps:Running the Tests
                We can run the tests by executing the following Maven command: mvn clean test

            **Notes**
            This will:

                Build the project: mvn clean install (implicitly done by mvn clean test).
                Run the shell script: The exec-maven-plugin will execute run-tests.sh, which includes building the project, starting mock APIs, running functional, UI, and integration tests, and stopping mock APIs.
                Execute TestNG tests: The maven-surefire-plugin will use the testng.xml file to run all the specified tests.



