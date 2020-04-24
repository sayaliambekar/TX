Feature: Job Management

  Scenario: Verify user having only one primary contact with Employer login
  
  	Given User is on Home page of application
    
    When title of page is "HireXpert"
    And enter valid user email address and password for registered employer and click on Sign in button
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button 
    And observe the employer with whom we are login will display in team member as primary contact
    And try to make one more member as primary contact
    Then user should not able to make multiple team members as primary contact
    And user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact
    And close the browser
    
  Scenario: Verify user having only one primary contact with Agency login
  
  	Given User is on Home page of application
    
    When title of page is "HireXpert"
    And enter valid user email address and password for registered agency and click on Sign in button
    And click on Workbench tab and select job from Jobs drop down
    And click on Share With Team button 
    And observe the agency with whom we are login will display in team member as primary contact
    And try to make one more member as primary contact
    Then user should not able to make multiple team members as primary contact
    And user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact
    And close the browser
    
#TC ID - 68,69,93