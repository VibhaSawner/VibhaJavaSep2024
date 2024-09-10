package First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptPropt {
	
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.id("basicelements")).click();
		Thread.sleep(3000);
		
		System.out.println("Click on javascript prompt");
		driver.findElement(By.id("javascriptPromp")).click();
		
		System.out.println("switch to alert");
		Alert alert=driver.switchTo().alert();
		
		System.out.println("send alert detail");
		String name="vibha";
		alert.sendKeys(name);
		
		System.out.println("accept alert");
		alert.accept();
		
		System.out.println("get generated alert");
		Thread.sleep(3000);
		String actual=driver.findElement(By.id("pgraphdemo")).getText();
		String expeceted="Hello "+name+"! How are you today?";
		
		System.out.println("verify text");
		if(actual.equals(expeceted)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println("close driver");
		driver.close();
	}
}
