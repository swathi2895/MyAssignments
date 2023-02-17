package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
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
		//Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		//Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click();
		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Swathi");
		//Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Chidam");
		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Swa");
		//Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Chidam");
		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.name("departmentName")).sendKeys("IT Department");
		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hello all");
		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("swathic@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'generalStateProvinceGeoId')]"));
		Select dd1= new Select(dropdown);
		dd1.selectByVisibleText("New York");
		//Click on Create Contact
		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		//Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		//Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		//Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Editing the contact");
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//td/input[@name='submitButton']")).click();
		//Get the Title of Resulting Page
		String title1=driver.getTitle();
		System.out.println(title1);

		

	}

}
