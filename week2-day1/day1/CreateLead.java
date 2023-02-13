package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
	    //Launch URL
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//UserName and Password using ID locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		// Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("swathi");
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chidam");
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Swathichidam");
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation practice");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT Department");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("swathic@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement province = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd=new Select(province);
		dd.selectByVisibleText("New York");
		//Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
		//Get the Title of Resulting Page
		String title=driver.getTitle();
		System.out.println(title);
		
       
	}
	

}
