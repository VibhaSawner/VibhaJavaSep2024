package First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promtAlert {
		
	public static void  main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.id("basicelements")).click();
		Thread.sleep(3000);
		
		System.out.println("click on javascript conformation alert");
		driver.findElement(By.id("javascriptConfirmBox")).click();
		
		System.out.println("Switch to alert");
		Alert alert=driver.switchTo().alert();
		
		System.out.println("print alert text");
		String getText=alert.getText();
		System.out.println(getText);
		
		System.out.println("click on ok button");
		alert.accept();
		
		System.out.println("get generated message");
		Thread.sleep(3000);
		String generatedText=driver.findElement(By.id("pgraphdemo")).getText();
		System.out.println(generatedText+" = generated text");
		
		System.out.println("close driver");
		driver.close();
		
	}
}
