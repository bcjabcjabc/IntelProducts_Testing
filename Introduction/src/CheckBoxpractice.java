import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //<div class="right-align" id="checkbox-example">
       driver.findElement(By.id("checkbox-example"));
       //<input id="checkBoxOption1" value="option1" name="checkBoxOption1" type="checkbox">
       Thread.sleep(2000);
      System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
       driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
       System.out.println(driver.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
       
       
       
	}

}
