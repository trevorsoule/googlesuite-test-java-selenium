# Google Search Test Suite

Navigates to Google, searches for "Ducks" and validates the web search results

## Built using
    Java
    Maven 
    Selenium
    TestNG 

## Running the tests
Run every test

`mvn clean install`

## Setup
Mac setup instructions
```
brew cask install java
brew install maven
```
Windows setup instructions
```
Install Java: https://www.java.com/en/download/help/windows_manual_download.html
Install Maven: https://maven.apache.org/install.html
```
## Building and running tests

Run tests
```
mvn clean test
```
Run specific test
```
mvn clean install -Dtest=testClass#testMethod
```
Run a test group
```
mvn clean install -Dgroups=groupName
```