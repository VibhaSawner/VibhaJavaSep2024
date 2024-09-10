package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PredefinedAction;

public class xpathPractice {

	
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("launch browser");
		WebDriver driver=PredefinedAction.start("http://automationbykrishna.com/#");
		
		
		System.out.println("click to demo table");
		driver.findElement(By.xpath("//a[text()=\"Demo Tables\"]")).click();
		
		
		System.out.println("get name of employee whree department is it");
		List<WebElement> listOfItems=driver.findElements(By.xpath("//td[contains(text(),'IT')]//parent::tr//child::td[3]"));
		//System.out.println(driver.findElement(By.xpath("//td[text()='Nikhil Patne']")).getText());
		int num=listOfItems.size();
		System.out.println(num);
		
		for(WebElement ele:listOfItems) {
			String e=ele.getText();
			 System.out.println(e);
			 
			// vibha@123456789
		}
	}
}
