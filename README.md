

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
        Directory: functional-tests

    Milestone 5: Integration Test Scripts

        Automated integration test scripts for the integration of the Campaign Scheduling service with recipient management and email template services.
        Language: Java
        Framework: JUnit with Mockito
        Directory: integration-tests

**Running the Tests**

    **Prerequisites**
        Ensure you have Java installed on your system.
        Set up the Selenium WebDriver and JUnit dependencies in your project for running the automated tests.

    **Running Functional Tests**
        Navigate to the functional-tests directory.
        Execute the shell script run-functional-tests.sh to run the automated functional tests.
        "./run-functional-tests.sh"

    **Running Integration Tests**
        Navigate to the integration-tests directory.
        Execute the shell script run-integration-tests.sh to run the automated integration tests.
        "./run-integration-tests.sh"

    **Mock APIs**
        Mock APIs for recipient management and email template services are included in the mock-apis directory.
  

