import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dell\\Downloads");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}

		}
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is Enabled");
			Assert.assertTrue(true);
			Thread.sleep(2000);
		} else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_btn_FindFlights']")).click();
		// <input type="submit" name="ctl00$mainContent$btn_FindFlights" value=""
		// id="ctl00_mainContent_btn_FindFlights">

		/*
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * 
		 * driver.findElement(By.id("divpaxinfo")).click(); Thread.sleep(2000);
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); int
		 * i=1; while(i<5) { driver.findElement(By.id("hrefIncAdt")).click(); i++;
		 * 
		 * } Thread.sleep(3000); WebElement Staticdropdown=driver.findElement(By.id(
		 * "ctl00_mainContent_DropDownListCurrency")); Select dropdown=new
		 * Select(Staticdropdown); dropdown.selectByIndex(1);
		 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		 * 
		 * if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
		 * System.out.println("is Enabled"); Assert.assertTrue(true);
		 * Thread.sleep(2000); } else { System.out.println("is Disabled"); } //<input
		 * type="submit" name="ctl00$mainContent$btn_FindFlights" value=""
		 * id="ctl00_mainContent_btn_FindFlights">
		 * driver.findElement(By.cssSelector("input[type='submit']")).click();
		 */Thread.sleep(3000);

	}

}
