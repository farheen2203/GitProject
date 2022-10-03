package practice;

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

public class BrokenLink {
	@Test
	public void tc01() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cnhindustrial.com/en-us");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement links:link) {
			String ui=links.getAttribute("href");
			m1(ui);
		}
		driver.quit();
		}
	public static void m1(String a) throws IOException {
		try {
			URL url=new URL(a);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();	
			con.setConnectTimeout(2000);
			con.connect();
			if(con.getResponseCode()>400) {
				System.out.println(a+ "-"+con.getResponseMessage()+"is a broken link");
			}
			else {
				System.out.println(a+ "-"+con.getResponseMessage()+"is a broken link");
			}
			
			
		
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
