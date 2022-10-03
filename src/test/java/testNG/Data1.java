package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data1 {
	
	@DataProvider
	public Object [][] getData() {
		Object [][] a=new Object[3][2];
		a[0][0]="admin";
		a[0][1]="manager";
		a[1][0]="789";
		a[1][1]="899";
		a[2][0]="jhag88";
		a[2][1]="61qg1g";
		return a;
	}
	
	
	
	@Test(dataProvider="getData")
	public void tc1(String user,String pass) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.name("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
		
		
	}

}
