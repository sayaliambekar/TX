package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilPackage.baseclass;

public class EditJobPage extends baseclass {
	
	@FindBy(id = "noticeperiod")
	public WebElement noticePeriod;
	
	@FindBy(id = "budget")
	public WebElement budget;
	
	
	
	public EditJobPage() {
		
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void updateJobDetails() throws InterruptedException {
		
		addjobpage.budget.clear();
		addjobpage.budget.sendKeys("350000");  //updating budget
		Thread.sleep(1000);
		addjobpage.noticePeriod.clear();
		addjobpage.noticePeriod.sendKeys("30");  //updating notice period
		Thread.sleep(1000);
	}

}
