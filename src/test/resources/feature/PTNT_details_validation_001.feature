@web_automation
Feature: User details validation.

  Background:
    Given that the user opens "ms_edge" browser
    When  the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the view and download of cumulative report functionality of the system.
      Then user enters username "7810275800089" and "Systemtest@012024"
      And user clicks My Profile option
      Then the user validates PathCare records