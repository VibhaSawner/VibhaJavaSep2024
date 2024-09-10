package First;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.PredefinedAction;

public class WindowHandling {

	
	public static void  main (String [] args) throws InterruptedException {
		System.out.println("launch browser");
		WebDriver driver=PredefinedAction.start("https://www.amazon.in/");
		
		System.out.println("serch summsung in serch field");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//div[@id=\"nav-search\"]/form/div[2]/div[1]/input"));
		PredefinedAction.sendText(element, "Sumsung");
		
		System.out.println("Enter tab");
		Thread.sleep(2000);
		WebElement clickElement=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		PredefinedAction.clickToElement(clickElement,true);
		
		
		
		System.out.println("scroll till Element");
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"][text()=\"Samsung Galaxy S24 Ultra 5G AI Smartphone (Titanium Gray, 12GB, 512GB Storage)\"]"));
		PredefinedAction.scrollToElement(element2);
		
		System.out.println("get cureent window id");
		String mainWindowId	=	driver.getWindowHandle();
		System.out.println(mainWindowId+" => main window id");
		
		System.out.println("click to sumsung tab");
		PredefinedAction.clickToElement(element2, false);
		
		System.out.println("get name of all window id");
		Set<String> multiplewindow=driver.getWindowHandles();
		System.out.println(multiplewindow+ " => multiple window id");
		
		System.out.println("Switch to next Window");
		Iterator<String> itr=multiplewindow.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			if(!name.equals(mainWindowId)) {
				driver.switchTo().window(name);
			}
		}
		
		System.out.println("verify next tab is open");
		String newtab=driver.getTitle();
		System.out.println(newtab+" => is new tabssssss");
		//System.out.println("close the browser");
		
		//PredefinedAction.closeBrowser();
	}
}
