package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	
         
	public static void main(String[] args) throws InterruptedException {
		String company=new String("Wells Fargo");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the window
		driver.manage().window().maximize();
		//UserName and Password using ID locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Enter first name
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[14]")).sendKeys("Swathi");
		//Click Find leads button
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
		Thread.sleep(1000);
		//Click on first resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Verify title of the page
		String title = driver.getTitle();
		System.out.println(title);
		//Click Edit
		driver.findElement(By.linkText("Edit")).click();
		//Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
		//Click Update
		driver.findElement(By.className("smallSubmit")).click();
		//Confirm the changed name appears
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(text.contains(company))
		{ System.out.println("Company name is updated");
		}
		else { System.out.println("Company name is not changed");}
		driver.close();
	}
	    
	 
}
