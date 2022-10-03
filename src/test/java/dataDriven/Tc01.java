package dataDriven;

import org.testng.annotations.Test;
import org.testng.xml.XmlRun;
import org.testng.xml.XmlTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc01 {
	@Test

	public void tc1(XmlTest xml){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(xml.getParameter("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(xml.getParameter("username"));
		driver.findElement(By.name("pass")).sendKeys(xml.getParameter("password"));
		
	}

}
