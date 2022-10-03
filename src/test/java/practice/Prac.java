package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac {
	@Test
	public void tc02() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnhindustrial.com/en-us");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	// driver.findElement(By.xpath("//button[text()='Our Company']/following-sibling::a[1]")).click();
		driver.findElement(By.xpath("//div[@class='Header__links_item']/child::button[text()='Our Company']")).click();
		//driver.findElement(By.xpath(".//[text()='Our Company']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Our Company")).click();
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click;", ele);
		driver.quit();
		
		
	}

}
