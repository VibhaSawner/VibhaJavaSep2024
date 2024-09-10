package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PredefinedAction;

public class FrameHandling {

	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Launch  the browser");
		WebDriver driver=PredefinedAction.start("http://automationbykrishna.com/#");
		
		System.out.println("Click to Iframe Demo");
		WebElement element=driver.findElement(By.xpath("//a[text()=\"IFrame Demo\"]"));
		PredefinedAction.clickToElement(element, true);
		
		System.out.println("switch to iframe");
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id=\"indexBody\"]/iframe[1]")));
		
		System.out.println("get frame text");
		Thread.sleep(2000);
		String str=driver.findElement(By.xpath("//h1[@class=\"d-1 fw-bold\"]")).getText();
		System.out.println("   "+str);
		
		System.out.println("back to main browser");
		driver.switchTo().defaultContent();
		
		System.out.println("get downwoard text ");
		String name=driver.findElement(By.xpath("//a[text()=\"Automation By Krishna\"]")).getText();
		System.out.println(name+ "=>  is your browser text");
	}
}
