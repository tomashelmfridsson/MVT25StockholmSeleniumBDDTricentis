Feature: Test of Tricentis demo webshop

  Scenario Outline: Broken links test of categories

    Given I open webpage "https://demowebshop.tricentis.com/"
    When I click on Category "<category>"
    Then I am on page "<category>"

    Examples:
      | category          |
      | Books             |
      | Computers         |
      | Electronics       |
      | Apparel & Shoes   |
      | Digital downloads |
