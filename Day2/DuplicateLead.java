package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		//Click Find leads button
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
		Thread.sleep(1000);
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		//Enter Email
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[17]")).sendKeys("Swathic@gmail.com");
		//Click Find leads button
		driver.findElement(By.xpath("(//td[@class='x-btn-center'])[7]")).click();
		Thread.sleep(2000);
        //Capture name of First Resulting lead
	    String firstname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		System.out.println("Name of first resulting lead is:"+firstname);
		//Click First Resulting lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		//Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//Verify the title as 'Duplicate Lead'
		String title2= driver.getTitle();
		System.out.println("Title of the page is "+title2);
		String duplicatename = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		if(title2.contains("Duplicate Lead | opentaps CRM"))
		{System.out.println("Title matches"); 
		}
		else
		{ System.out.println("Title not matches"); 
		}
		//Click Create Lead
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Confirm the duplicated lead name is same as captured name
		
		String duplicateName2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(duplicatename.equals(duplicateName2))
		{ System.out.println("Duplicate name is same as captured name");
		}
		else
		{ System.out.println("Duplicate name is not same as captured name");
		}
		driver.close();
		}
		 
	

	}


