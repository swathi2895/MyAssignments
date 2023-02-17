package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
		//Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9999999999");
		//Click find leads button
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
		Thread.sleep(2000);
		//Capture lead ID of First Resulting lead
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
        //Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads"));
		//Enter captured lead ID
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(leadID);
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String records = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(records);
		if(records.contains("No records to display"))
		{ System.out.println("Lead deleted successfully");
		}
		else
		{ System.out.println("Lead not deleted");
		}
		driver.close();
		
		

	}

}
