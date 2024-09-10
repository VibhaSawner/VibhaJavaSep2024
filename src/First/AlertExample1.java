package First;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("click on basic element");
		driver.findElement(By.id("basicelements")).click();
		
		Thread.sleep(3000);
		System.out.println("Enter on userFirst Name");
		String firstName="vibha";
		driver.findElement(By.id("UserFirstName")).sendKeys(firstName);
		
		System.out.println("Enter on userLastName");
		String lastName="Rajput";
		driver.findElement(By.id("UserLastName")).sendKeys(lastName);
		
		System.out.println("Enter comapany name");
		String companyName="Adm";
		driver.findElement(By.id("UserCompanyName")).sendKeys(companyName);
		
		Thread.sleep(3000);
		System.out.println("click on submit button");
		driver.findElement(By.xpath("//div[@class=\"panel-body\"]//div[4]/button")).click();
		
		System.out.println("Switch  to alert");
		Alert alert=driver.switchTo().alert();
		
		System.out.println("get Alert text");
		String actualText=alert.getText();
		String expected=firstName+" and "+lastName+" and "+companyName;
		
		System.out.println("verify test");
		if(actualText.equals(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		System.out.println("Click on alert  ok button ");
		alert.accept();
		
		Thread.sleep(3000);
		
		System.out.println("Enter email Address");
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("vibha@gmail.com");
		
		System.out.println("Enter password");
		driver.findElement(By.id("pwd")).sendKeys("vibh123");
		
		System.out.println("click on submit button");
		driver.findElement(By.id("submitb2")).click();
		
		System.out.println("switch to alert");
		Alert alert2=driver.switchTo().alert();
		
		System.out.println("verify alert text");
		String actualText2=alert2.getText();
		String expectedText="You successfully clicked on it";
		
		System.out.println("verify text");
		if(actualText2.equals(expectedText)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println("print Alert Text");
		System.out.println(actualText2+" = actual second alert message ");
		
		System.out.println("Accept second Alert");
		alert2.accept();
		
		System.out.println("close driver");
		driver.close();
	}
}
