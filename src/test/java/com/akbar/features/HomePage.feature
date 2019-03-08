Feature: Sircon for Carriers page

  Scenario: Finding Sircon for Carriers page
    Given I am on the Vertafore home page
    When I search for "Sircon for Carriers!"
    Then the page should have at least one link with "Sircon for Carriers"