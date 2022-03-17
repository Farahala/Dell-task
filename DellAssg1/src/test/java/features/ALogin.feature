Feature: Login Action
  Background:open Url
    Given I am on the login page of swage lab

 Scenario Outline: Login succellfy
    When I enter a vaild <username> and <password>
   Examples:
     |username|password|
     |"standard_user"|"secret_sauce"|


  Scenario Outline: Add item to shopping cart
    When I enter a vaild <username> and <password>
    Then add item to cart
    Then user can checkout
    Examples:
      |username|password|
      |"standard_user"|"secret_sauce"|

  Scenario Outline: making checkout
    When I enter a vaild <username> and <password>
    And  add item to cart
    Then user can checkout
    Then fill <fName> and <lName> and <ZipCode> to Continue checkout
    Then return to the home page
    Examples:
      |fName|lName|ZipCode|username|password|
    |"Farah"|"Alaa"|"1234"|"standard_user"|"secret_sauce"|
