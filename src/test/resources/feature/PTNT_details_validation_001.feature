@web_automation
Feature: User details validation.

  Background:
    Given the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the view and download of cumulative report functionality of the system.
      When user enters username "7810275800089" and "Systemtest@012024"
      Then user clicks My Profile option
      And the user validates PathCare records