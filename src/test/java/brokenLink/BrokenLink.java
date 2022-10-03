package brokenLink;

import org.testng.annotations.Test;
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
	public static void tc(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationstepbystep.com/jmeter-advanced/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement links:link) {
	//	for(int i=0;i<link.size();i++) {
		//	WebElement E1 = link.get(i);
			
			//System.out.println(links.getText()+" "+links.getAttribute("href"));
			String urlnew = links.getAttribute("href");
			m1(urlnew);
			
		}
		driver.quit();
		
		
	}
	public static void m1(String um) {
		try {
			URL url=new URL(um);
			HttpURLConnection con=(HttpURLConnection)url.openConnection();
			con.setConnectTimeout(5000);
			con.connect();
			if(con.getResponseCode()>=400) {
				System.out.println(um+ "-"+con.getResponseMessage()+"is a broken link");
			}
			else {
				System.out.println(um+ "-"+ con.getResponseMessage()+ "is a valid link");
			}
			
			
			
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			
		}
	}

}
