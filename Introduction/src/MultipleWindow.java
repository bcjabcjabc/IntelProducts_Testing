import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);
        
      Set<String>handles= driver.getWindowHandles();
      Iterator<String> it= handles.iterator();
      String parentWindow=it.next();
      String childWindow=it.next();	
      driver.switchTo().window(childWindow);
      driver.get("https://rahulshettyacademy.com");
      //<a href="https://courses.rahulshettyacademy.com/p/get-access-to-all-courses">All-Access Membership-Complete Access to 25+ Courses (and counting!)</a>
      String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(courseName);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
