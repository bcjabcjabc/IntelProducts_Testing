import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Greencart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\dell\\Downloads");
		WebDriver driver = new ChromeDriver();
		//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w =new WebDriverWait(driver,5);
		
		
		
		
		
		
		
		String[] neededveggies = {"Cucumber", "Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		addItems(driver, neededveggies);
		//<img class=" " src="https://res.cloudinary.com/sivadass/image/upload/v1493548928/icons/bag.png" alt="Cart">
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//<button type="button" class=" ">PROCEED TO CHECKOUT</button>
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated("By.cssSelector(\"input.promoCode\"))"));
		//<input type="text" class="promoCode" placeholder="Enter promo code">
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		//<button class="promoBtn">Apply</button>
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//<span class="promoInfo" style="color: green;">Code applied ..!</span>
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo"));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	public static void addItems(WebDriver driver, String[] neededveggies) {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedname = name[0].trim();

			List itemsneededlist = Arrays.asList(neededveggies);

			if (itemsneededlist.contains(formatedname)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == neededveggies.length)
					
				{
					break;
				}
			}
		}
	}
}
