package testPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingTickets {
	WebDriver driver;

	public BookingTickets(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name="tripType")
	List<WebElement> tripType;
	
	
	
	public Logout BookingTic()
	{
		for(WebElement t:tripType)
		{
			if(t.getAttribute("value").equals("oneway"))
			{
				t.click();
			}
		}
		return PageFactory.initElements(driver, Logout.class);
	}

}
