Feature: check whether userr able to login with valid credentials

  Scenario Outline: Login into MakeMyTrip application
    Given User is on MakeMyTrip login page
    When User enter <from> and <To> location
    And User clicks Search button
    Then User should get list of flight details
    
    Examples:
			| from    | To       	|
			| Chennai | Bengaluru |
			| Delhi   | Chennai   |

    