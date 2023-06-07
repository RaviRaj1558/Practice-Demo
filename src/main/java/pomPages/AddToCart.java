package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	
	@FindBy(id="add")
	private WebElement addbtn;
	
	 
	public WebElement getAddbtn() {
		return addbtn;
	}


	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocartbtn;
	
	
	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	public void addtocartbutton() {
		addtocartbtn.click();	
	}
}
