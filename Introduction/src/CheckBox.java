import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    	Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
    	
    	//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
    	//<input id="ctl00_mainContent_chk_friendsandfamily" type="checkbox" name="ctl00$mainContent$chk_friendsandfamily">
    	driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//to check all the checkboxes present.
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//<input id="ctl00_mainContent_rbtnl_Trip_1" type="radio" name="ctl00$mainContent$rbtnl_Trip" value="RoundTrip">
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("is Enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("is Disabled");
		}
	}

}
