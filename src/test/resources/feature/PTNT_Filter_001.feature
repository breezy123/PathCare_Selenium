@web_automation
Feature: Results filter functionality

  Background:
    Given the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the results filter functionality of the system
      When user enters username "7810275800089" and "Systemtest@012024"
      Then user clicks My Results option
      And user enters value "Urine" to filter results
      Then users validates Filtered Data by extracting all Datatable