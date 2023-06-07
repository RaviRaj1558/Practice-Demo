package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillrarydemoApplication {

	
	@FindBy(id="course")
	private WebElement coursetab;
	
	public WebElement getCoursetab() {
		return coursetab;
	}
	
	@FindBy (name="addresstype")
	private WebElement coursedd;
	
	
	public WebElement getCoursedd() {
		return coursedd;
	}

	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtrainning;
	
	
	public SkillrarydemoApplication(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}

public void Seleniumtrainingtab() {
	seleniumtrainning.click();
}
	
	
}
