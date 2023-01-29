import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kubera {

	public static void main(String[] args) {
	
		
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32 (1)");
		WebDriver driver=new ChromeDriver();
		driver.get("https://sts.ust.com/adfs/ls/?client-request-id=83618da0-4088-2000-00b8-1c13d478bb97&username=&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=estsredirect%3d2%26estsrequest%3drQQIARAAnVHPaxNBFN7JpmsS2xrqxYMHkZwsk52ZnexOAoK7m1krFBIqJaKHsj9NQppddze1iie99KDQnoSeRPCSm55KBfGcUw6C0L9ABUEEJUc36KHH4sfj4_He9-DxfddEXMWNCvoLBc4ZoiDA0PXn3SnEK6Xyqxf2s70bwhXh6PLFT7vvXx6C5VGSwvuD0LEHVTfcHgPaTdMoachytvg3T7p27Edhb5jOJfJWEMbbiez5gT0apFU7iXaPAJgC8AWAce4B0hFhhqqqhk64pelMxxhbdVXVqakqFldNzBhiGiaqxQy9CTmiNYs0mwRrnOgGRpwwbhqc8bpGsWXx7L5OFU03qZmVpRvc4maNcYMgi2B6krvQ0kdpl8wpjHuP_Z-54vzHrShM0kMx32qih2PxTCa9Eys2pQoOqANdgjRINUWB9ZqCoEJdxOy6QxzmTUQpjPxhz5vmwbf8IhIbhUKpLFzKnJ3lweuFzOonz7Wv4q_22sG9zgSnO8JkQTY6_Udm4PU32m0f3e2srg52bju3bvZbm2h9o0kjazO-I6vKut4Kr6MG3pfAviQdS8WCWBauimYb_5DA3jnhuPhfGU3Pg5NFXCq6oRPbQ6_nrVQwdrwsCgUyzUeQYqcGHUdjEDkuVVxmM5_ZT5fOJPu4JMyWZ78_H7x98-H72h81#");
        driver.findElement(By.id("userNameInput")).sendKeys("150218@ust-global.com");
	}

}
