import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement Staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
			//	<select name="ctl00$mainContent$DropDownListCurrency" id="ctl00_mainContent_DropDownListCurrency" class="valid">
		//<option value="">Select</option>
		//<option value="INR">INR</option>
		//<option value="AED">AED</option>
		//<option value="USD">USD</option>

	
	 Select dropdown=new Select(Staticdropdown);
	 dropdown.selectByIndex(1);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	dropdown.selectByVisibleText("USD");
   System.out.println(dropdown.getFirstSelectedOption().getText());
    dropdown.selectByValue("AED");
    System.out.println(dropdown.getFirstSelectedOption().getText());
    

	}

}
