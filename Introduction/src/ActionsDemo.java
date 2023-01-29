import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_myh38910a_e&adgrpid=57794344246&hvpone=&hvptwo=&hvadid=610644601170&hvpos=&hvnetw=g&hvrand=4087421282898377971&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061988&hvtargid=kwd-362216169274&hydadcr=5620_2359471&gclid=Cj0KCQiAic6eBhCoARIsANlox87MAreMLWzispmZI8nr2qAF9iwJOTUHMI7JSbQwgI6CM1gROa5neJMaAiOCEALw_wcB");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		//a.moveToElement(move).contextClick().build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		

	}

}
