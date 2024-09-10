package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		System.out.println("switch to frame");
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(element);
		
		
		System.out.println("Click on drag and drop tab");
		Actions ac=new Actions(driver);
		Thread.sleep(2000);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]/p"));
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]/p"));
		Thread.sleep(2000);
		ac.clickAndHold(drag).dragAndDrop(drag,drop).build().perform();
	}
	
}
