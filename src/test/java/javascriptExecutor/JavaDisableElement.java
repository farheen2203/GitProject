package javascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaDisableElement {
	@Test
	public void tc2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("/Users/farheen/Desktop");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("abc"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//to write in disabled place
		js.executeScript("document.getElementById('abc').value='selenium'");
		//to erase in disabled place
		js.executeScript("document.getElementById('abc').value=''");
		//get title using javascript

		
	}


}
