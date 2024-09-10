package Second;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.PropertiesFilesReader;

public class PracticePropExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("launch browser");
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		Thread.sleep(2000);
		WebDriver driver=new ChromeDriver();
		String url=PropertiesFilesReader.getValue("url");
		driver.get(url);
		driver.manage().window().maximize();
		
		System.out.println("Click to basic element");
		driver.findElement(By.id("basicelements")).click();
		
		System.out.println("Enter userName");
		String userName=PropertiesFilesReader.getValue("firstname");
		driver.findElement(By.id("UserFirstName")).sendKeys(userName);
		
		System.out.println("Enter lastName");
		String lastName=PropertiesFilesReader.getValue("lastname");
		driver.findElement(By.id("UserLastName")).sendKeys(userName);
	}
	
}
