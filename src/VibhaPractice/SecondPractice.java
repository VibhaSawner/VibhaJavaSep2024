package VibhaPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondPractice {
	
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
	
	System.out.println("Scroll till dropdown");
	Thread.sleep(1000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement element=driver.findElement(By.xpath("//select[@class=\"form-control\"]"));
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	
	System.out.println("select value from dropdown");
	Select oselect=new Select(element);
	boolean ismultiple=oselect.isMultiple();
	System.out.println(ismultiple+" = is dropdown multiple");
	
	System.out.println(" dropdown");
	List<WebElement> dropdownEle=oselect.getOptions();
	
	for(WebElement el:dropdownEle) {
		String eletext=el.getText();
		System.out.println(eletext+" ");
		int num=Integer.parseInt(eletext);
		if(num%2==0) {
			oselect.selectByVisibleText(eletext);
		}
	}
	System.out.println("Print selected Number");
	List<WebElement> allSelected=oselect.getAllSelectedOptions();
	
	for(WebElement selcElement:allSelected) {
		String str=selcElement.getText();
		System.out.println(str+" = All slected options");
	}
	System.out.println("........................................");
	System.out.println("Get first Selected Options");
	WebElement firstSelecetd=oselect.getFirstSelectedOption();
	System.out.println(firstSelecetd.getText()+" first Selected Options");
	
	
	
	}
}
