Feature: Page Loading
  As as user,
  I want to load the page
  So that I can see the content

 Scenario: Simple page loading

   Given I control a web browser
   When I load the page
   Then I should see a greeting