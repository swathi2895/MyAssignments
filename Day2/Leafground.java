package week2.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leafground {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		//Type your name
		driver.findElement(By.xpath("//div[@class='col-12']/input")).sendKeys("Swathi");
		//Append Country to this City
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[2]")).sendKeys(" India");
		//Verify if text box is disabled
		boolean enabled=driver.findElement(By.xpath("(//div[@class='col-12']/input)[3]")).isEnabled();
		System.out.println("Is the field enabled? :"+enabled);
		//Clear the typed text
		driver.findElement(By.xpath("(//div[@class='col-12']/input)[4]")).clear();
		//Retrieve the typed text
		String text=driver.findElement(By.xpath("(//div[@class='col-12']/input)[5]")).getAttribute("value");
		System.out.println(text);
		//Type email and Tab. Confirm control moved to next element
		WebElement tabKey = driver.findElement(By.xpath("(//div[@class='col-12']/input)[6]"));
		tabKey.sendKeys("swathic@gmail.com");
		tabKey.sendKeys(Keys.TAB);
		boolean currentTextbox = driver.findElement(By.xpath("(//div[@class='col-12']/textarea)")).equals(driver.switchTo().activeElement());
		System.out.println("Confirm whether cursor moved to next element? "+currentTextbox);
		//Type about yourself
		driver.findElement(By.xpath("(//div[@class='col-12']/textarea)")).sendKeys("Hi all, Im swathi from Trichy");
		//Text Editor
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])")).sendKeys("Practicing Automation");
		//Just Press Enter and confirm error message*
		driver.findElement(By.xpath("((//div[@class='grid formgrid'])/div/input)[7]")).sendKeys(Keys.ENTER);
		WebElement errorText = driver.findElement(By.xpath("//span[@class='ui-message-error-detail']"));
		System.out.println("Error text is :"+errorText.getText());
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		//Type your name and choose the third option
		driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/input")).sendKeys("swathi");
	    driver.findElement(By.xpath("//li[@data-item-label='swathi3']")).click();
	    //Click and Confirm Keyboard appears
	    driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-keyboard-input')]")).click();
	    //Custom Toolbar
	    driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("This is textbox");
	    		
		
		
		
	}

}
