import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		//to find how many frames present in webpage
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
	  //to identify frames using indexes
		
	//driver.switchTo().frame(0)
		
		//to come out of frames
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
