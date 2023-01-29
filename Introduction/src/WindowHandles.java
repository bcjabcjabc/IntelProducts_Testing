import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
        driver.get("http://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        //<a href="https://rahulshettyacademy.com/documents-request" class="blinkingText" target="_blank">Free Access to InterviewQues/ResumeAssistance/Material</a>
        driver.findElement(By.cssSelector("a[class='blinkingText']")).click();
        Set<String> window= driver.getWindowHandles();
        Iterator<String>it= window.iterator();
        String parentId=it.next();
        String childId=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
       String emailID= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       driver.switchTo().window(parentId);
       driver.findElement(By.id("username")).sendKeys(emailID); 
        
     
	}

}
