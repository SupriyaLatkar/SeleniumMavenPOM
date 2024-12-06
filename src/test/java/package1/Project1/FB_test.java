package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FB_test
{

	@Test
	public void Login_fromSource()
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	FB_Source ob=new FB_Source(driver);
	ob.un();
	ob.pwd();
	ob.login();
	
	
	}
	
}
