Feature: Login


  Background:
    Given User Navigates to isometrix site
     And User login using valid "Candi1" and "Candi1!"

  Scenario: Select exact data only for Module A2 -Textbox
    When User Navigate to "Module C2" page
    And User Clicks on "Add" button
    And User Navigate to "Module Sources" page
    And User Navigate to "Module A2 - Specific" page
    And User Clicks on "A2 Column 1" check box
    And User Clicks on "A2 Column 2" check box
    And User Clicks on "A2 Column 3" check box
    And User Clicks on "A2 Column 4" check box
    Then User Clicks on "Save" button
    Then User Clicks on "Logout" button

