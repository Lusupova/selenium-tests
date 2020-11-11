# General

## Install sdkman

https://sdkman.io/install

## Install Java

```shell script
sdk install java 15.0.1-zulu
```

## Run application

Click green button in `UsersStoreApplication` class

## Open application

In your browser go to http://localhost:8081

# Testing information and tasks

## Unit testing

 - `JUnit` (or `TestNG`) is used for testing separate methods
 - `Mockito` can be added to mock some behavior of certain method(s)
 
*TASK*: Start with testing `UserRepository` and `UserService`, you would need `JUnit` for tests and `Mockito` to mock actual DB connectivity

*TASK*: Practice Java syntax on `Exercism` (https://exercism.io/my/tracks)
 
Docs:
 - https://junit.org/junit5/docs/current/user-guide/
 - https://site.mockito.org/
 - https://www.baeldung.com/mockito-annotations

## Integration testing

 - `Spring` has its own way of integration testing, however, this part should be left out for different tutorial
 - `Cucumber` is a well-known 'Given-When-Then' BDD testing tool

*TASK*: Try to write an integration test against `UserService` with Cucumber (following test scenarios):
 - add a user
 - check it is present in DB
 - delete that user
 - check there is no such user in DB anymore

Docs:
 - https://cucumber.io/docs/guides/10-minute-tutorial/

## API testing

 - `Spring` again has its own way of API testing
 - `REST-assured` is quite popular Java tool without any particular dependency on used library/framework

*TASK*: Try to test REST API of this application with `REST-assured`
 - Get all users (GET http://localhost:8081/users/all)
 - Get user by id (GET http://localhost:8081/users/{userId})
 - Save user (POST http://localhost:8081/users --data '{"name":"user_name","age":"user_age"}')
 - Delete user by id (DELETE http://localhost:8081/users/{userId})

Docs:
 - https://rest-assured.io/
 
## UI testing

 - `Selenium WebDriver` is a UI testing framework based on browser drivers (starts a headless browser and runs tests)
 - `htmlUnit` also starts headless browser but doesn't open UI
 
*TASK*: Check out http://localhost:8081 UI and test what you see there

Docs:
 - https://www.selenium.dev/documentation/en/
 - https://www.selenium.dev/documentation/en/webdriver/browser_manipulation/
