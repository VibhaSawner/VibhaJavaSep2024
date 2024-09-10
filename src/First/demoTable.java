package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PredefinedAction;

public class demoTable{

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=PredefinedAction.start("http://automationbykrishna.com/#");
		
		System.out.println("click to demo table");
		WebElement element=driver.findElement(By.xpath("//a[text()=\"Demo Tables\"]"));
		PredefinedAction.clickToElement(element,true);
		
		
		System.out.println("Get total rows in Employee Details");
		Thread.sleep(2000);
		List<WebElement> totalOfRows=driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr"));
		
		System.out.println("verify : table row count");
		PredefinedAction.verifyScript(5, totalOfRows.size(), true, null, null);
		
		System.out.println("find number of coloums");
		List<WebElement> numOfColoums=driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th"));
		
		System.out.println("verify number of coloums");
		PredefinedAction.verifyScript(4, numOfColoums.size(), true, null, null);
		
		System.out.println("close browser");
		PredefinedAction.closeBrowser();
		
		System.out.println("....end..");
	}
}
