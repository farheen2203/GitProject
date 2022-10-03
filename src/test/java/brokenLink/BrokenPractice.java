package brokenLink;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenPractice {
	@Test
	public void tc1() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		for(WebElement links:link) {
			String ur=links.getAttribute("href");
			m1(ur);
		}
		
	}

	public void m1(String ur) throws IOException {
		URL url=new URL(ur);
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		con.setConnectTimeout(200);
		con.connect();
		// TODO Auto-generated method stub
		
	}

}
