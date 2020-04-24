package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class ShareWithTeamPage extends baseclass {
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[1]/h5/button")
	public WebElement AddTeamButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[1]/input")
	public WebElement agencyTeamName;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[2]/input")
	public WebElement agencyTeamEmail;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[1]/div/div/form/div[3]/input")
	public WebElement agencyTeamContactNumber;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Team Member')]")
	public WebElement addToTeamMember;
	
	@FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-add-jobprovider/div[2]/button[2]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/input")
	public WebElement searchField;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[4]/label/input")
	public WebElement primaryContactRadioButton;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-share-job-with-team/div[3]/button") 
	public WebElement closeButton;
	
	@FindBy(xpath = "//td[5]//label[1]//span[1]")   //2nd team member share checkbox after searching
	public WebElement shareCheckbox;
	
	@FindBy(xpath = "//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[5]/label/span")
	public WebElement shareCheckboxForSearchedTeam;
	
	@FindBy(xpath = "//td[4]//label[1]//span[1]") //2nd team member primary contact after searching
	public WebElement secondRowPrimaryContact;
	
	@FindBy(id = "confirmModalBtn")
	public WebElement yesButtonShareCheckbox;
	
	@FindBy(xpath = "//td[8]//label[1]//span[1]")
	public WebElement blockUnblockCheckbox;
	
	public ShareWithTeamPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickOnAddButton() {
		
		AddTeamButton.click();
	}
	
	public void fillAgencyTeamDetails() {
		
		agencyTeamName.sendKeys("AB Agency Team 1");
		agencyTeamEmail.sendKeys("abagency2team1@gmail.com");
		agencyTeamContactNumber.sendKeys("2542144154");
	}
	
	public void selectAddToTeamMember() {
		
		addToTeamMember.click();
	}
	
	public void searchAgencyTeam() {
		
		String expectedEmail = prop.getProperty("agencyteamemail");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void searchEmployerTeam() {
		
		String expectedEmail = prop.getProperty("teamemail");
		searchField.click();
		searchField.sendKeys(expectedEmail);
	}
	
	public void searchEmployerPrimaryContact() {
		
		String expectedEmployerEmail = prop.getProperty("employeremail");
		searchField.click();
		searchField.sendKeys(expectedEmployerEmail);
		String actualEmployerEmail= driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[2]")).getText();
			
		if(expectedEmployerEmail.equals(actualEmployerEmail)) {
			
			System.out.println("record found..");
			
			Boolean value = false;
			value = primaryContactRadioButton.isSelected();
			
			if(value == true) {
				
				System.out.println("\nLogged in employer is primary contact..");
			}
		}
	}
	
	public void searchAgencyPrimaryContact() {
		
		String expectedAgencyEmail = prop.getProperty("agencyemail");
		searchField.click();
		searchField.sendKeys(expectedAgencyEmail);
		String actualAgencyEmail= driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[2]")).getText();
			
		if(expectedAgencyEmail.equals(actualAgencyEmail)) {
			
			System.out.println("record found..");
			
			Boolean value = false;
			value = primaryContactRadioButton.isSelected();
			
			if(value == true) {
				
				System.out.println("\nLogged in agency is primary contact..");
			}
		}
	}
	
	
//	public void getTeamSize()
//	{
//		
//		List<WebElement> elememnt = driver.findElements(By.xpath("//*[@id=\"style-5\"]/div/div/div/table/tbody/tr/td[4]/label/input"));
//		
//		WebElement tablerows = driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div/div/table"));
//		List<WebElement> TotalRowsList = tablerows.findElements(By.tagName("tr"));
//		int count = TotalRowsList.size();
//		System.out.println("Total number of Rows in the table are : "+ count);
//				
//		if(count>=2) {
//			System.out.println("Team member present..");
//			
//			
//		} else {
//			System.out.println("Team members are not present");
//		}
//		
//	}
//	
//	public void verifyJobSharedWithTeamMember() {
//		Boolean value = false;
//		value = shareCheckbox.isSelected();
//		
//		if(value == true) {
//			
//			System.out.println("\nJob is shared with this team member..");
//		} 
//		else {
//			System.out.println("Job is not shared with team member..");
//			
//		}
//		
//	
//	}
	
	public void shareJobWithTeamMember() {
		
		String secondTeamMemberEmail = driver.findElement(By.xpath("//*[@id=\"style-5\"]/div/div/div/table/tbody/tr[2]/td[2]")).getText();
		searchField.sendKeys(secondTeamMemberEmail);
		shareCheckbox.click();
		yesButtonShareCheckbox.click();
		
//		Boolean value = false;
//		value = shareCheckbox.isSelected();
//		
//		if(value == true) {
//			
//			System.out.println("\nJob is already shared with this team member..");
//		} 
//		else {
//			shareCheckbox.click();
//			yesButtonShareCheckbox.click();
//		}
	}
	
	

}
