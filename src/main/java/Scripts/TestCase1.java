package Scripts;

import org.testng.annotations.Test;

import genricLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryLoginPage;
import pomPages.SkillrarydemoApplication;

public class TestCase1 extends BaseClass {

	@Test
	public void tc1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.Gearsbutton();
		s.skillrarrydemoApplication();
		
		SkillrarydemoApplication d= new SkillrarydemoApplication(driver);
		driverutilies.switchTab(driver);
		driverutilies.mouseHover(driver,d.getCoursetab());
		d.Seleniumtrainingtab();
		
		AddToCart a=new AddToCart(driver);
		driverutilies.doubleClick(driver,a.getAddbtn());
		a.addtocartbutton();
		driverutilies.alertPopup(driver);
		
		
		
	}
	
}
