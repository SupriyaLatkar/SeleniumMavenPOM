package package1.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_accListHoverover_SRC 
{

	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement AccList;
	
	public void AccList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(AccList).perform();
	}
	
	public Amz_accListHoverover_SRC(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
