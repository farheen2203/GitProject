package chromeOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless_incognito {
	@Test
	public void tc1() throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-- headless");
		//maximize mode
		option.addArguments("start-maximized");
		//notification
		option.addArguments("disable-notifications");
		//incognito
		option.addArguments("--incognito");
		//version
		option.addArguments("--version");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
	
		
		
	}

}
//https://github.com/bharanilikith/advanceselenium.git(advancegithub)