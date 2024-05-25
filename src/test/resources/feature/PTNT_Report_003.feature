#@web_automation
Feature: PDF reports view and download functionality (Cumulative Report)

  Background:
    Given the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the view and download of cumulative report functionality of the system.
      When user enters username "7810275800089" and "Systemtest@012024"
      Then user clicks My Results option
      And user clicks on Cumulative button to download report
#      Then users validates Filtered Data by clicking on it