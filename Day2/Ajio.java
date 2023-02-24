package week3.Day2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total items are: "+totalItems);
		
		List<WebElement> brand = driver.findElements(By.className("brand"));
		System.out.println("Brands are "+brand.size());
		for (WebElement webElement : brand) {
			String text = webElement.getText();
			System.out.println(text);
		}
		List<WebElement> bagsName = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagsName.size());
		System.out.println("Names of the Bags");
		for (WebElement webElement : bagsName) {
			String text = webElement.getText();
			System.out.println(text);
		}

		

		
		
		
	}

}

