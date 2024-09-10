package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedAction {

	
	public static WebDriver driver;
	
	final public static WebDriver start(String url) {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeBrowser(){
		driver.close();
	}
	
	public static void scrollToElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static void scrollToElement(WebElement element,boolean isWaitRequiered) {
		if(isWaitRequiered) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", element);
		}
	}
	
	
	public static void clickToElement(WebElement element,boolean isWaitRequired) throws InterruptedException {
		if(isWaitRequired) {
			Thread.sleep(2000);
			element.click();
		}else {
			element.click();
		}
	}
	
	public static void sendText(WebElement element,String str) {
		element.sendKeys(str);
	}
	
	
	public static void sendText(WebElement element,String str,boolean isWeitRequired) {
		if(isWeitRequired) {
			element.sendKeys(str);
		}
	}
	
	public static void impliWait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public  static  void verifyScript(int actual,int expected,boolean isWaitRequired,String expected1,String actual2 ) {
		if(isWaitRequired) {
			if(expected==actual || expected1.equals(actual2)) {
				System.out.println("pass");
			}else {
				System.out.println("fails");
			}
		}else {
			if(expected==actual || expected1.equals(actual2)) {
				System.out.println("pass");
			}else {
				System.out.println("fails");
			}
		}
		
		
	}
}

