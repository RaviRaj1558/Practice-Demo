package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarydemoApplication;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass {

	@Test
	public void TC2() throws IOException, InterruptedException {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.Gearsbutton();
		s.skillrarrydemoApplication();
		
		SkillrarydemoApplication sd = new SkillrarydemoApplication(driver);
		driverutilies.switchTab(driver);
		//Thread.sleep(5000);
		driverutilies.Dropdown(sd.getCoursedd(), p.getpropertyFileData("coursedd"));
		//driverutilies.dropdown(sd.getCoursedd(), p.getpropertyFileData("coursedd"));
	
		Thread.sleep(2000);
		TestingPage t = new TestingPage(driver);
		driverutilies.dragdrop(driver, t.getSeleniumtraining(), t.getCart());
		Point fb = t.getFacebookicon().getLocation() ;
		int x = fb.getX();
		int y=fb.getY();
		Thread.sleep(2000);
		driverutilies.ScrollBar(driver, x, y);
		t.facebook();
	}
	
	
}
