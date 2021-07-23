@login
Feature: Log in

  Background:user on smart bear url
    Given user open url "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx"

  Scenario: user can log in smart bear website
    When user enters username as "Tester" to username box
    And user enter password as "test" to password box
    When user click on log in button
    Then user can view user dashboard



