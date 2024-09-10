package First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javascriptscroll {

	public static void main (String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.id("basicelements")).click();
		Thread.sleep(3000);
		
		System.out.println("find the element for scrolling");
		WebElement element=driver.findElement(By.xpath("//div[@class=\"wrapper\"]/section/div[5]/div/section[2]/div/form/div[3]/div/select[2]"));
		
		System.out.println("scroll till dropdown");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		System.out.println("How many options are there");
		Select select=new Select(element);
		List<WebElement> allOptions=select.getOptions();
		allOptions.size();
		System.out.println("..............");
		for(WebElement list:allOptions) {
			System.out.println(" options =>  "+list.getText());
		}
		
		System.out.println(" Is there dropdown is multiSelect ");
		System.out.println(select.isMultiple());
		
		System.out.println("Select all even number");
		for(WebElement op:allOptions) {
			String word=op.getText();
			int num=Integer.parseInt(word);
			if(num%2==0) {
				select.selectByVisibleText(word);
				
			}
		}
		
		System.out.println("............");
		System.out.println("print first selected options");
		WebElement firstselected=select.getFirstSelectedOption();
		System.out.println(firstselected.getText()+" = first selected options");
		System.out.println("............");
		
		System.out.println("How many options are selected");
		List<WebElement> allselectedoptions=select.getAllSelectedOptions();
		for(WebElement selectedAllitems:allselectedoptions) {
			System.out.println(selectedAllitems.getText()+"=>  this is all selected options");
		}
		
		System.out.println("................");
		System.out.println("deselect first selecetd options");
		List<WebElement> allselectedoptions2=select.getAllSelectedOptions();
		for(WebElement selectedAllitems:allselectedoptions2) {
			String name2=selectedAllitems.getText();
			select.deselectByVisibleText(name2);
			System.out.println("current deselect options => "+name2);
			break;
		}
		System.out.println("................");
		
		System.out.println("deselect all selected options and select all selected options");
		List<WebElement> element3=select.getOptions();
		for(WebElement ele:element3) {
			String word2=ele.getText();
			if(ele.isSelected()) {
				select.deselectByVisibleText(word2);
				System.out.println(word2+" = deselect value");
			}else {
				select.selectByVisibleText(word2);
				System.out.println(word2+" = select value");
			}
		}
		System.out.println("................");
	}
}
