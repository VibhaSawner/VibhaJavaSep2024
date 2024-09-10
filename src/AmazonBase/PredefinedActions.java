package AmazonBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PredefinedActions {

	 static WebDriver driver;
	 
	 @Test
	public  void start(){
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
}
