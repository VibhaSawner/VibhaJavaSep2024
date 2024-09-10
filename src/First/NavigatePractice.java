package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatePractice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationbykrishna.com/#");
		driver.manage().window().maximize();
		
		System.out.println("Varify automation by krishna is loaded");
		String ActualTitle=driver.getTitle();
		String expectedTitle="Login Signup Demo";
		 if (expectedTitle.equals(ActualTitle)) {
			 System.out.println("pass ");
		 }else {
			 System.out.println("fail ");
		 }
		 Thread.sleep(2000);
		 System.out.println("Navigate to automationByPractice");
		 driver.navigate().to("https://practice.automationtesting.in/");
		 
		 System.out.println("varify correcturl is loaded ");
		 String title=driver.getTitle();
		 String expectedtitle="Automation Practice Site";
		 System.out.println(title);
		 if (title.equals(expectedtitle)) {
			 System.out.println("pass ");
		 }else {
			 System.out.println("fail ");
	}
		 
		 System.out.println("Navigate back to previpous url");
		 driver.navigate().back();
		 
		 System.out.println("verify automation by krishna is loaded");
		 String ActualTitle1=driver.getTitle();
		 String expectedTitle1="Login Signup Demo";
			 if (expectedTitle1.equals(ActualTitle1)) {
				 System.out.println("pass ");
			 }else {
				 System.out.println("fail ");
			 }
			 System.out.println("navigate forward");
			 driver.navigate().forward();
			
			 System.out.println("varify automationByPractice is laoded");
			 String title2=driver.getTitle();
			 String expectedtitle2="Automation Practice Site";
			 if (title2.equals(expectedtitle2)) {
				 System.out.println("pass ");
			 }else {
				 System.out.println("fail ");	 
			 }
			 
			 System.out.println("close driver");
			 driver.close();
}
}