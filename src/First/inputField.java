package First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.xpath("//a[text()=\"Basic Elements\"]")).click();
		
		System.out.println("verify input filed");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@id=\"UserFirstName\"]"));
		ele.sendKeys("vibha");
		
		
		System.out.println("click on login");
		driver.findElement(By.xpath("//button[text()=\"Submit\"]")).click();
		
		System.out.println("handle alert");
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		System.out.println("get input text");
		String value=ele.getText();
		String newstr=ele.getAttribute("value");
		System.out.println(newstr+"       ");
		
	}
}
