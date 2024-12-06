package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Source 
{

	WebDriver driver;
	
	//step 1
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login_button;
	
	//step 2
	public void un()
	{
		username.sendKeys("abc@gmail.com");
	}
	
	public void pwd()
	{
		password.sendKeys("123456");
	}
	
	public void login()
	{
		login_button.click();
	}
	
	//step 3
	public  FB_Source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
