package genricLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	public void Dropdown(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	public void dragdrop(WebDriver driver, WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();

	}

	public void switchFrames(WebDriver driver) {
		driver.switchTo().frame(0);

	}

	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();

	}

	public void alertPopup(WebDriver driver) {

		driver.switchTo().alert().accept();
	}

	public void switchTab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
	}

	public void ScrollBar(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (" + x + "," + y + ")");

	}
}
