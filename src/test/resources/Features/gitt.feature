Feature:Verifying virtual gift card feature in GiftCardsPage
 Background:navigate to url and homepage
  Given  I  navigate to  url
  Then   I should be able to navigate to HomePage
  When   I click on Gift Cards link
  Then   I should be able to navigate to the GiftCardsPage
  @ui
Scenario: clicking on giftcadlink
 Given  I  navigate to  url
 Then   I should be able to navigate to HomePage
 When   I click on Gift Cards link
 Then   I should be able to navigate to the GiftCardsPage
   @ui
 Scenario: verify user registration by clicking on registerlink on giftcards page
    When I click on Register link on Gift Cards Page
    And  I should be able to select a female button in gender
    When I should be able to enter the following details
         | FirstName | LastName  | DateOfBirth | DateOfMonth | DateOfYear  |     Email                   |   Company     | Password  | Confirm Password|
         | swapna    | Katnuru   |     14      |     January |  1981      | swapna.katnuru109@gmail.com   |  qaautomation | swapna123 |    swapna123    |
