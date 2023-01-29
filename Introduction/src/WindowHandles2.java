import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		//<a href="/windows">Multiple Windows</a>
		driver.findElement(By.linkText("Multiple Windows")).click();
		//Set<String>window= driver.getWindowHandles();
		//<a href="/windows/new" ,="" target="_blank">Click Here</a
		driver.findElement(By.cssSelector("a[href*='Windows']")).click();
		//<h3>New Window</h3>
		
		Set<String> abc=driver.getWindowHandles();
		Iterator<String>it =abc.iterator();
		String parentWindow=it.next();
	
		driver.switchTo().window(it.next());
		
       driver.findElement(By.xpath("//div/h3")).getText();
       driver.switchTo().window(parentWindow);
       
		
		
		
		
	}

}
