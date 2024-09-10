package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.PredefinedAction;

public class mouseHoverUsingAction {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("launch browser");
		WebDriver driver=PredefinedAction.start("https://www.flipkart.com/");
		
		System.out.println("Mouse hover to fashion tab");
		Actions action=new Actions(driver);
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//div[@aria-label=\"Fashion\"]"));
		action.moveToElement(element).build().perform();
		
		System.out.println("click to kids link");
		List<WebElement> listOfItems=driver.findElements(By.xpath("//div[@class='_16rZTH']/object/a"));
		Thread.sleep(2000);
		for(WebElement items:listOfItems) {
			String name=items.getText();
			//System.out.println("name => "+name);
			if(name.equals("Kids")) {
				items.click();
				break;
			}
		}
		
		System.out.println("click to menu button");
		List<WebElement> listOfelement2=driver.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		for(WebElement ele:listOfelement2) {
			String str=ele.getText();
			System.out.println(str);
			if(str.equals("Women")) {
				action.moveToElement(ele).perform();
				break;
			}
		}
		System.out.println("clcik to blouse tab");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_1QrT3s\"]/div[2]/a[5]")).click();
		
		System.out.println("scroll to 10th tab");
		Thread.sleep(2000);
		WebElement tenthElement=driver.findElement(By.xpath("//div[@class=\"_2MImiq\"]/nav/a[10]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(600,4300)");
		
		System.out.println("click to 10 element");
		tenthElement.click();
	}
}
