Feature: check whether userr able to login with valid credentials with tags

@Regression
  Scenario: sample 1 with tag test
    Given User is on OLX login page
    When User clicks on Login button 
    And User enter invalid userName and Password
    Then User should get navigated to Dashboard
    
    
    
    
@smoke @Regression
  Scenario: sample 2 with tag test
    Given 
    When 
    And 
    Then 
    
    
 #Tags can eb provide above Feature or Scenario or Scenario outline or Examples
 # BUt not above the keywords likke Given , When , Then , And
 