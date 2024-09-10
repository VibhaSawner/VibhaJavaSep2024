package First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.PredefinedAction;

public class ActionsClass {

	
	public static  void main(String[] args) throws InterruptedException {
		System.out.println("launch browser");
		WebDriver driver=PredefinedAction.start("http://automationbykrishna.com/#");
		
		System.out.println("click to basic element");
		driver.findElement(By.id("basicelements")).click();
		
		System.out.println("scroll till element");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//a[text()=\"Double-click on me\"]"));
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		
		System.out.println("double click to element");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		action.doubleClick(element).build().perform();
		
		System.out.println("handleed alert");
		Alert alert=driver.switchTo().alert();
		String actualText=alert.getText();
		System.out.println(actualText+" = is a popup message ");
		
		System.out.println("accept  alert");
		alert.accept();
	}
}
