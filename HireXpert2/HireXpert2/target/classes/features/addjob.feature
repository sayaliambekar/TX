Feature: Job Management

  Scenario: To verify user is able to add and edit job for Employer login
  
    Given User is on Home page of application
    
    When title of page is "HireXpert"
    And enter valid user email address and password for registered employer and click on Sign in button
    And click on Workbench tab
    And click on Add Job button 
    And fill all mandatory details on Add Job popup window
    And click on submit button
    Then Job should get successfully added and Job should be visible in Job drop down
    And click on Job drop down and select recently added job
    And click on Edit Job button to make changes in job
    And make any changes in the job
    And click on submit button
    Then User should be able to update the job
    And again click on Edit Job button and observe the changes
    Then all updated information should be saved in the job
    And click on Add Skill button and add some skills
    Then one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills
    And click on Delete Skill button in front of any skill
    Then after clicking on Delete Skill button present in front of skill then that skill row should get deleted
    And close the browser
    
   Scenario: To verify user is able to add and edit job for Agency login
  
    Given User is on Home page of application
    
    When title of page is "HireXpert"
    And enter valid user email address and password for registered agency and click on Sign in button
    And click on Workbench tab
    And click on Add Job button 
    And fill all mandatory details on Add Job popup window and select employer from Employer drop down
    And click on submit button
    Then Job should get successfully added and Job should be visible in Job drop down
    And click on Job drop down and select recently added job
    And click on Edit Job button to make changes in job
    And make any changes in the job
    And click on submit button
    Then User should be able to update the job
    And again click on Edit Job button and observe the changes
    Then all updated information should be saved in the job
    And click on Add Skill button and add some skills
    Then one job skill row should get added after clicking on Add Skill button and user should able to add only ten skills
    And click on Delete Skill button in front of any skill
    Then after clicking on Delete Skill button present in front of skill then that skill row should get deleted
    And close the browser
    
    
#TC ID - 15,21,22,46,74