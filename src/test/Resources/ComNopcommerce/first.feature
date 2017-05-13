@Regression
Feature: registration

  @SmokeTest1
  Scenario: registration
    Given user on home page
    When click on registration
    Then user should navigate to registration page


    @SmokeTest2
    Scenario: book page
      Given user on book page
      When user click on book
      Then user should navigate to that book

