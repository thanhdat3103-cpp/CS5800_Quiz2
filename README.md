
# CS 5800 - Quiz 2

## Overview

This project demonstrates Test-Driven Development (TDD)
using Java, Maven, and JUnit 5.

The implementation includes two components:
- Calculator
- DateChecker

The development process follows the
Red-Green-Refactor cycle.

## Technologies

- Java 26
- Maven
- JUnit 5 (5.10.2)
- IntelliJ IDEA

## Project Structure

```text
CS5800_Quiz2/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       ├── Calculator.java
    │       └── DateChecker.java
    └── test/
        └── java/
            ├── CalculatorTest.java
            └── DateCheckerTest.java
```

## Part 1 - Calculator

The Calculator class provides five methods:

- sum(int x, int y): Adds two integers.
- subtract(int x, int y): Subtracts two integers.
- multiply(int x, int y): Multiplies two integers.
- divide(int x, int y): Performs integer division.
- isEven(int value): Checks whether an integer is even.

The unit tests cover:
- Positive and negative numbers
- Zero values
- Integer division
- Division by zero
- Even and odd numbers

Division by zero throws IllegalArgumentException
with the message "Cannot divide by zero".

## Part 2 - DateChecker

DateChecker uses a nested Month enum containing
all twelve calendar months.

The has31Days(Month month) method returns:

- true: January, March, May, July, August,
  October, December.
- false: February, April, June, September,
  November.

February explicitly returns false because
it has either 28 or 29 days, never 31.

A null month throws IllegalArgumentException
with the message "Month cannot be null".

Parameterized tests using @EnumSource verify
both groups of months.

## Test-Driven Development

The project was developed using the
Red-Green-Refactor process:

1. RED: Write a test that fails for the
   expected reason.
2. GREEN: Implement the minimum code
   necessary to pass the test.
3. REFACTOR: Improve the implementation
   without changing its behavior.

The GitHub commit history documents these stages
throughout the development process.

## Running Unit Tests

Run the following command from the project root:

    mvn clean test

Alternatively, open the Maven tool window in
IntelliJ IDEA and run:

1. Lifecycle -> clean
2. Lifecycle -> test

## Final Test Results

CalculatorTest:
- Tests run: 17
- Failures: 0
- Errors: 0
- Skipped: 0

DateCheckerTest:
- Tests run: 16
- Failures: 0
- Errors: 0
- Skipped: 0

Total:
- Tests run: 33
- Failures: 0
- Errors: 0
- Skipped: 0

Final Maven result: BUILD SUCCESS

## GitHub Repository

https://github.com/thanhdat3103-cpp/CS5800_Quiz2

The repository contains more than 10 meaningful
commits documenting the TDD development process.
