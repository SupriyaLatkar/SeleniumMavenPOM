package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amz_accListHoverover_test 
{
   @Test
	public void AccListHoverOver()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Amz_accListHoverover_SRC ob=new Amz_accListHoverover_SRC(driver);
		ob.AccList(driver);
	}
}
