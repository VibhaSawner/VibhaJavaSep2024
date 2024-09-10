package First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.id("basicelements")).click();
		
		Thread.sleep(3000);
		
		System.out.println("click on simple alert");
		driver.findElement(By.id("javascriptAlert")).click();
		
		System.out.println("switch to alert");
		Alert alert=driver.switchTo().alert();
		
		System.out.println("get alert text");
		String actualText=alert.getText();
		System.out.println(actualText);
		
		System.out.println("accept alert");
		alert.accept();
		
		
	}
}
