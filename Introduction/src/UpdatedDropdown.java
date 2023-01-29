import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//C:\\Users\\dell\\Downloads
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	
    	
    	
    	
    	
    	driver.findElement(By.id("divpaxinfo")).click();
    	//<span class="pax-add pax-enabled" id="hrefIncAdt">+</span>
    	Thread.sleep(2000);
    	
    	//<input class="buttonN" id="btnclosepaxoption" value="Done" type="button">
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	int i=1;
    	while(i<5)
    	{
    		driver.findElement(By.id("hrefIncAdt")).click();
    		i++;
    		
    	}
    	
    	//same we can do for for loop also
    	//for (int i=1;i<5;i++)
    	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    	driver.findElement(By.id("btnclosepaxoption")).click();
    	
    	
    	
    	
		
		
	}

}
