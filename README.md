# Bank Account Example - Unit Testing with Coverage

This Java project demonstrates unit testing and code coverage using a simple `BankAccount` class. The project includes methods for depositing, withdrawing, and transferring funds with basic validation rules. We will implement unit tests using [JUnit](https://junit.org/junit5/), and we will measure code coverage with [JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/).

Note that the pom.xml file is already configured to run JaCoCo.

## Prerequisites

- **Java** (JDK 8 or higher)
- **Maven** (3.6 or higher)

## Getting Started

1. **Clone the Repository**: Clone the project to your local machine.
    ```bash
    git clone <repository-url>
    cd <your-project-directory>
    ```

2. **Build the Project**: Compile the project using Maven.
    ```bash
    mvn clean compile
    ```

3. Run the unit tests

```bash
mvn test
```

4. Generate a coverage report

```
mvn jacoco:report
```

This will generate a `target/site/jacoco/index.html` file, which you can open in your browser to view the coverage report.

## Your Task

Add tests to `BankAccountTest.java` to achieve 100% statement and branch coverage for the BankAccount class.
