package First;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadExample {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.id("basicelements")).click();
		Thread.sleep(3000);
		
		System.out.println("clcik to upload button");
		Actions action=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//input[@id=\"exampleInputFile\"]"));
		action.click(element).perform();
		
		System.out.println("upload  url");
		StringSelection ss=new StringSelection("C:\\Users\\hp\\eclipse-workspace\\SeleniumFeb2224\\src\\Second\\PracticePropExample.java");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
