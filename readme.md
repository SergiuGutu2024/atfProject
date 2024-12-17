# Java Automated Test Framework (ATF)

## Introduction

My Java Automated Test Framework uses Selenium for testing how application looks and behaves in a web browser, lets me
write tests in an easy-to-understand language with Cucumber and Gherkin, checks APIs with Rest Assured, and ensures
database is working correctly using Hibernate JPA. After running tests, it sends all the results to Report Portal,
giving a clear view of how tests went.

## Features

- **UI Testing**: Automated browser interactions using Selenium, supporting major web browsers.
- **BDD Support**: Gherkin syntax for writing tests, making them understandable to non-technical stakeholders.
- **API Testing**: Comprehensive REST API testing capabilities with Rest Assured.
- **Database Testing**: Simplified database testing using Hibernate JPA for verifying data integrity and state.
- **Reporting**: Integration with Report Portal for advanced test reporting and analytics.

## Requirements

- Java JDK 12 or later.
- Maven 3.9.6 or later (for dependency management and project building).
- An instance of Postgress database.
- An instance of Report Portal (for reporting purposes).

## Installation

1. Clone the repository to your local machine:
    ```
    git clone [repository URL]
    ```
2. Navigate to the project directory and install the dependencies using Maven:
    ```
    cd [project name]
    mvn install
    ```

## Usage

1. **Writing Tests**: Write your tests in Gherkin language within the `features` directory. Each feature file
   corresponds to a particular functionality being tested.
2. **Running Tests**: To run the tests, use the following Maven command:
    ```
    mvn test -DTestRunner
    ```
3. **Viewing Reports**: After test execution, navigate to your Report Portal dashboard to view the test reports and
   analytics.
4. Create Image details.
