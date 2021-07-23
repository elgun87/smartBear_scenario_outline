@order
Feature: Order Process

  Scenario Outline: user order process as "<name>"
    Given user open url "http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2ftestcomplete12%2fweborders%2fDefault.aspx"
    When user enters username as "Tester" to username box
    And user enter password as "test" to password box
    And user click on log in button
    When user click on "Order" page
    And user select "<product>" from product dropdown
    And user enters "<quantity>" quantity
    When user enters "<name>" as customer name
    And user enters "<street>" as street
    And user enters "<city>" as city
    And user enters "<state>" as state
    And user enters "<zipcode>" as zip code
    And user select "Visa" as card type
    Then user enters "<card number>" as card number
    And user enters "<expiration date>" as expiration date
    And user clicks proccess button
    And user click on "View all orders" page
    Then user verifies "<name>" is in the list
    Examples:
      | name            | street             | city        | state | zipcode | card number      | expiration date | quantity | product     |
      | John Wick       | Kenzie Ave         | Chicago     | IL    | 60056   | 1111222233334444 | 12/22           | 1        | FamilyAlbum |
      | Ken Adams       | San Luis Ave       | San Jose    | CA    | 95117   | 2311222237434444 | 08/22           | 10       | MyMoney     |
      | Rachel Green    | Santa Teressa blvd | Chicago     | IL    | 60966   | 5691222233334444 | 12/22           | 9        | ScreenSaver |
      | Luis Garcia     | Olive Hill Drive   | San Jose    | CA    | 95117   | 7811222237434444 | 08/22           | 3        | MyMoney     |
      | Elariz Memmedov | Axirinci povorot   | Chicago     | IL    | 71966   | 5691759233334444 | 12/22           | 7        | ScreenSaver |
      | Zelimxan Yagub  | Sinonimler Toplusu | Los Angelas | CA    | 85117   | 7811222237434444 | 08/22           | 21       | MyMoney     |


