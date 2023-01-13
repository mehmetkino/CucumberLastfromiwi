Feature: User wanns to login with invalid values

  @LoginTest
  Scenario Outline: User wanst to test google login page
    Given User wants to go to https://demo.guru99.com/test/login.html
    When User wants to fill out login info as "<Email>","<passWord>"
    Then The user wants to click on Google login button
    And User wants to verify that invalid info
    Examples:
    | Email         |  passWord |
    |gkhns@gmail.com| gkhnsk123 |
    |gjkac@gmail.com|32041cap!  |
    |gjkaasdasdsadc@gmail.com|32041cap!  |
    |gjkac@asdasdasmail.com|32041cap!  |
    |gjkac@asdasdasmail.com|32041cap!  |
    |gjkac@asdasdasmail.com|32041cap!  |


