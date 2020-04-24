$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Admin/eclipse-workspace/HireXpert/HireXpert/src/main/java/features/addAndDeleteEmployer.feature");
formatter.feature({
  "line": 1,
  "name": "Job Management",
  "description": "",
  "id": "job-management",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify agency is able to add employer from \u0027Add job\u0027 page and Agency not able to delete that employer with whom job is added",
  "description": "",
  "id": "job-management;verify-agency-is-able-to-add-employer-from-\u0027add-job\u0027-page-and-agency-not-able-to-delete-that-employer-with-whom-job-is-added",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home page of application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of page is \"HireXpert\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "enter valid user email address and password for registered agency and click on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on Workbench tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "click on Add Job button and fill mandatory details",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on plus button in front of employer field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Fill the employer details \u0026 click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Now click on employer field drop down and select added employer name",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click on submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "click on Employers tab at the top",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "agency should able to add employer and added employer should reflect in Employer drop down on Add Job page and Employer tab",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click on Delete icon in front of employer for which job is added",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "agency should not able to delete employer which is link to job and error message should display",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.user_is_on_Home_page_of_application()"
});
formatter.result({
  "duration": 46216437400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HireXpert",
      "offset": 18
    }
  ],
  "location": "addAndDeleteEmployerSteps.title_of_page_is(String)"
});
formatter.result({
  "duration": 9200500,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.enter_valid_user_email_address_and_password_for_registered_agency_and_click_on_Sign_in_button()"
});
formatter.result({
  "duration": 5270874900,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.click_on_Workbench_tab()"
});
formatter.result({
  "duration": 3097965100,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.click_on_Add_Job_button_and_fill_mandatory_details()"
});
formatter.result({
  "duration": 6244676400,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.click_on_plus_button_in_front_of_employer_field()"
});
formatter.result({
  "duration": 5069025700,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.fill_the_employer_details_click_on_submit_button()"
});
formatter.result({
  "duration": 373572500,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.now_click_on_employer_field_drop_down_and_select_added_employer_name()"
});
formatter.result({
  "duration": 2439172600,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.click_on_submit_button()"
});
formatter.result({
  "duration": 5068724500,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.click_on_Employers_tab_at_the_top()"
});
formatter.result({
  "duration": 3063233000,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.agency_should_able_to_add_employer_and_added_employer_should_reflect_in_Employer_drop_down_on_Add_Job_page_and_Employer_tab()"
});
formatter.result({
  "duration": 183897500,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.click_on_Delete_icon_in_front_of_employer_for_which_job_is_added()"
});
formatter.result({
  "duration": 67190400,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.agency_should_not_able_to_delete_employer_which_is_link_to_job_and_error_message_should_display()"
});
formatter.result({
  "duration": 13018900,
  "status": "passed"
});
formatter.match({
  "location": "addAndDeleteEmployerSteps.close_the_browser()"
});
formatter.result({
  "duration": 5663162300,
  "status": "passed"
});
});