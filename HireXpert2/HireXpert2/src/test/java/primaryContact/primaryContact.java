package primaryContact;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilPackage.baseclass;

public class primaryContact extends baseclass {
	
	@Given("^User is on Home page of application$")
	public void user_is_on_Home_page_of_application() throws Throwable {
	    
		baseclass.initialization();
	}

	@When("^title of page is \"([^\"]*)\"$")
	public void title_of_page_is(String arg1) throws Throwable {
	    
		String title = loginpage.validateTitle();
		System.out.println("Title of application: " + title);
	}

	@When("^enter valid user email address and password for registered employer and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_registered_employer_and_click_on_Sign_in_button() throws Throwable {
	    
		loginpage.signInEmployer();
		Thread.sleep(5000);
	}

	@When("^click on Workbench tab and select job from Jobs drop down$")
	public void click_on_Workbench_tab_and_select_job_from_Jobs_drop_down() throws Throwable {
	    
		dashboardpage.openWorkbenchPage();
		Thread.sleep(3000);
		workbenchpage.selectJob();
		Thread.sleep(3000);
	}

	@When("^click on Share With Team button$")
	public void click_on_Share_With_Team_button() throws Throwable {
	    
		workbenchpage.shareWithTeamButton.click();
		Thread.sleep(3000);
	}

	@When("^observe the employer with whom we are login will display in team member as primary contact$")
	public void observe_the_employer_with_whom_we_are_login_will_display_in_team_member_as_primary_contact() throws Throwable {
	    
		sharewithteampage.searchEmployerPrimaryContact();
		Thread.sleep(3000);
	}

	@When("^try to make one more member as primary contact$")
	public void try_to_make_one_more_member_as_primary_contact() throws Throwable {
	    
		System.out.println("\nPrimary contact radio button is disabled for other team members..");
		
//		sharewithteampage.closeButton.click();
//		Thread.sleep(1000);
//		workbenchpage.shareWithTeamButton.click();
//		Thread.sleep(3000);
		
//		sharewithteampage.getTeamSize();
//		sharewithteampage.verifyJobSharedWithTeamMember();
//		sharewithteampage.secondRowPrimaryContact.click();
//		driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div/div/table/tbody/tr[2]/td[4]/label/span")).click();  //try to click on primary contact radio button of other team member
	}

	@Then("^user should not able to make multiple team members as primary contact$")
	public void user_should_not_able_to_make_multiple_team_members_as_primary_contact() throws Throwable {
	    
		System.out.println("\nUser not able to make multiple team members as primary contact..");
//		sharewithteampage.searchField.clear();
		sharewithteampage.closeButton.click();
		Thread.sleep(2000);
		workbenchpage.shareWithTeamButton.click();
		Thread.sleep(3000);
//		Boolean primary = sharewithteampage.secondRowPrimaryContact.isSelected();

//		if(primary == false) {
//			System.out.println("\nUser not able to make multiple team members as primary contact..");
//		}
//		else {
//			System.out.println("\nUser able to make multiple team members as primary contact..");
//		}
	}

	@Then("^user should able to change the primary contact only when the job is shared with the team member to whom user wants to make primary contact$")
	public void user_should_able_to_change_the_primary_contact_only_when_the_job_is_shared_with_the_team_member_to_whom_user_wants_to_make_primary_contact() throws Throwable {
	    
		sharewithteampage.shareJobWithTeamMember();
		System.out.println("\nNow job is shared with team member..");
		Thread.sleep(3000);
		sharewithteampage.secondRowPrimaryContact.click();
		sharewithteampage.yesButtonShareCheckbox.click();
		System.out.println("Now other team member is primary contact");
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	    
		Thread.sleep(5000);
		driver.quit();
	}
	
	@When("^enter valid user email address and password for registered agency and click on Sign in button$")
	public void enter_valid_user_email_address_and_password_for_registered_agency_and_click_on_Sign_in_button() throws Throwable {
	    
		loginpage.signInAgency();
		Thread.sleep(5000);
	}

	@When("^observe the agency with whom we are login will display in team member as primary contact$")
	public void observe_the_agency_with_whom_we_are_login_will_display_in_team_member_as_primary_contact() throws Throwable {
	    
		sharewithteampage.searchAgencyPrimaryContact();
		Thread.sleep(3000);
	}


}
