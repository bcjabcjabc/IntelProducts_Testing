import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
      //  <input type="text" placeholder="Username" id="inputUsername" value="">
        driver.findElement(By.id("inputUsername")).sendKeys("Madhu");
     // <input type="password" placeholder="Password" name="inputPassword" value="">
        driver.findElement(By.name("inputPassword")).sendKeys("123");
       // <button class="submit signInBtn" type="submit">Sign In</button>
        driver.findElement(By.className("signInBtn")).click();
     //   <p class="error">* Incorrect username or password </p>
         System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       //  <a href="#">Forgot your password?</a>
         driver.findElement(By.linkText("Forgot your password?")).click();
        // <input type="text" placeholder="Name">
         driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Madhu");
        // <input type="text" placeholder="Email">
        driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("madhuhandral@gmail.com");
       driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).clear();
        driver.findElement(By.xpath("//form/input")).sendKeys("madhuhandral99997@gmail.com");
    
       //<input type="text" placeholder="Phone Number">
        driver.findElement(By.xpath("//form/input")).sendKeys("12418081809");
       // <button class="reset-pwd-btn">Reset Login</button>
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        
       
        
        
        
        
        
	}
	
	
	
	

}
