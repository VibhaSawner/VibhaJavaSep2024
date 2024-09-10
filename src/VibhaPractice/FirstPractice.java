package VibhaPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPractice {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("launch browser and hit url");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-workspace\\SeleniumFeb2224\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationbykrishna.com/#");
	driver.manage().window().maximize();
	
	System.out.println("Click on basic-element");
	driver.findElement(By.xpath("//a[@id=\"basicelements\"]")).click();
	
	System.out.println("Verify page is loaded successfully");
	String actualTitle=driver.getTitle();
	String expected="Login Signup Demo";
	if(expected.equals(actualTitle)) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	}
	
	Thread.sleep(2000);
	
	System.out.println("click on alert");
	driver.findElement(By.xpath("//button[@id=\"javascriptAlert\"]")).click();
	
	System.out.println("Handled alert");
	Alert alert=driver.switchTo().alert();
	String actualtext=alert.getText();
	System.out.println(actualtext+" ");
	alert.accept();
	
	System.out.println("click on confirmation alert");
	driver.findElement(By.xpath("//button[@id=\"javascriptConfirmBox\"]")).click();
	
	System.out.println("handle confirmation alert");
	Alert cAlert=driver.switchTo().alert();
	cAlert.accept();
	
	String cText=driver.findElement(By.xpath("//p[@id=\"pgraphdemo\"]")).getText();
	System.out.println("text after confirmation alert => "+cText);
	
	
	System.out.println("click on javascript prompt");
	driver.findElement(By.xpath("//button[@id=\"javascriptPromp\"]")).click();
	
	Alert promptAlert=driver.switchTo().alert();
	promptAlert.sendKeys("cute vibha");
	promptAlert.accept();
	
	String promptActualText=driver.findElement(By.xpath("//p[@id=\"pgraphdemo\"]")).getText();
	System.out.println(promptActualText+" ");
	
	System.out.println("click on MultiOpenMultiWindow");
	String maninWindow=driver.getWindowHandle();
	System.out.println(maninWindow+" main id");
	driver.findElement(By.xpath("//button[@id=\"javascriptMultiWindow\"]")).click();
	
	Set<String> multiplewindow=driver.getWindowHandles();
	System.out.println(""+multiplewindow);
	Iterator<String> itr=multiplewindow.iterator();
	while(itr.hasNext()) {
		String name=itr.next();
		if(!name.equals(maninWindow)) {
			driver.switchTo().window(name);
		}
	}
	 
	System.out.println("get Multi window Text");
	String curentmaninWindow=driver.getWindowHandle();
	//String text=driver.findElement(By.xpath("//body/p")).getText();
	System.out.println(curentmaninWindow+" ");
	
	System.out.println("close driver");
	driver.close();
	}
	
	
}
