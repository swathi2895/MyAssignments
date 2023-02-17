package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	//Launch URL
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	//Maximize the window
	driver.manage().window().maximize();
	//Add implicit wait
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	//Click on Create New Account button
	driver.findElement(By.linkText("Create new account")).click();
	//Enter the first name
	driver.findElement(By.name("firstname")).sendKeys("swathi");
	//Enter the last name
	driver.findElement(By.name("lastname")).sendKeys("Chidam");
	//Enter the mobile number
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8978987897");
	//Enter the password
	driver.findElement(By.id("password_step_input")).sendKeys("Qwertyuiop@1");
	//Handle all the three drop downs
	WebElement dayDD = driver.findElement(By.xpath("//select[@id='day']"));
	Select dd1=new Select(dayDD);
	dd1.selectByVisibleText("28");
	WebElement monthDD = driver.findElement(By.xpath("//select[@id='month']"));
	Select dd2=new Select(monthDD);
	dd2.selectByValue("2");
	WebElement yearDD = driver.findElement(By.xpath("//select[@id='year']"));
	Select dd3=new Select(yearDD);
	dd3.selectByVisibleText("1995");
	//Select the radio button "Female"
	driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	
	
	
	
	
	
}
}
