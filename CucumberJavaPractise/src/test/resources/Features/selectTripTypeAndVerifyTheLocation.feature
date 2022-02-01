Feature: check whether user able to select the 'TripType' and nextday

  Scenario: Verify whether user able to select 'Trip Type'
    Given User is on the page where all the flight details gets displayed
    When User clicks on TripType
    And Select TripType with data in excel at "C:\Eclipse\CucumberJavaPractise\src\test\java\ExcellFiles\makeMyTrip_datas.xlsx"
    Then User should get flight details according to the selected "TripType'
    
    
 Scenario: Verify whether user able to select next date from Current
    Given User is on the page where all the flight details gets displayed based on tripType selected
    When User clicks on nextDate
    Then the flight details for the corresponding date should display