package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base {

	public static Scenario verify;
	
	public static void clickWithActions(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		highlightelementRedBorder(element);
		element.click();
	}
	
	/**
	 * this method will take an element as parameter and will click it on UI
	 * @param element
	 */
	public static void doClick(WebElement element) {
		highlightelementRedBorder(element);
		element.click();
	}
	
	/**
	 * this method will take an element as parameter and will hover mouse on it
	 * @param element
	 */
	public static void hoverMouseOverElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	/**
	 * this method will take an element as parameter and will get and return its text from UI
	 * @param element
	 * @return
	 */
	public static String getTextFromUI(WebElement element) {
		highlightelementRedBorder(element);
		String textFromUI = element.getText();
		return textFromUI;
	}
	
	/**
	 * this method will take an radio button element and will check if it's displayed, enabled and not selected
	 * when all conditions met it will click on that radio button
	 * if not it will print " One of the conditions did not return expected value"
	 * @param element
	 */
	public static void clickOnRadioButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				highlightelementRedBorder(element);
				element.click();
			} else {
				System.out.println(" One of the conditions did not return expected value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will take an check box element and will check if it's displayed, enabled and not selected
	 * when all conditions met it will click on that check box
	 * if not it will print " One of the conditions did not return expected value"
	 * @param element
	 */
	public static void clickOnCheckBoxButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				highlightelementRedBorder(element);
				element.click();
			} else {
				System.out.println("One of the conditions did not return expected value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will take picture of your computer screen (ScreenShot) 
	 * it will take an string as your out put photo name and will throw IO Exception
	 * if the path you provided is not correct
	 * @param screenshotName
	 * @throws IOException
	 */
	public static void takeScreenShot(String screenshotName) throws IOException {
		String path = ".\\output\\screenshots\\";
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(path + screenshotName + ".png"));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("takeScreenshot: => Exception was throw during execution");
		}
	}
	
	/**
	 * this method will take a web element as parameter and will click on it 
	 * with the help of java script executer
	 * @param element
	 */
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		highlightelementRedBorder(element);
		js.executeScript("arguments[0].click();", element);
	}
	
	/**
	 * this method will take a web element as parameter and will draw a red
	 * square around it with the help of java script executer
	 * @param element
	 */
	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}
	
	/**
	 * this method will take a web element as parameter and will put a yellow  
	 * highlight behind that element with the help of java script executer
	 * @param element
	 */
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}
	
	/**
	 * this method will take a web element as parameter and will draw a red
	 * square around it as well as put a yellow  
	 * highlight behind it with the help of java script executer
	 * @param element
	 */
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		highlightelementRedBorder( element);
		try {
			Thread.sleep(500);
			js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
			Thread.sleep(500);
			highlightelementRedBorder( element);
			Thread.sleep(500);
		} catch (Exception e) {
			System.err.println("This Exception happened "+e.getMessage()+" during highlighting !");
		}
	}
	
	/**
	 * this method will scroll down in a web page with the help
	 * of java script executer
	 * from (0, 1000), you can modify the 100 field and scroll down
	 * the page as per your testing needs
	 */
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
						
	}
	
	/**
	 * this method will scroll up in a web page with the help
	 * of java script executer
	 * from (1000, 0), you can modify the 100 field and scroll down
	 * the page as per your testing needs
	 */
	public static void scrollUpPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1000, 0)");
	}
	/**
	 * this method will scroll down in a web page with the help
	 * of java script executer
	 * scroll all the way down to the page bottom
	 */
	public static void scrollToPageBottom() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}

	/**
	 * this method will take element and String value as parameters and 
	 * send value with the help of JSExecutor to that particular 
	 * element
	 * @param element
	 * @param value
	 */
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		highlightelementBorderAndBackground(element);
		js.executeScript("arguments[0].value='" + value + "'", element);
	}
	
	/**
	 * this method will take element and integer value as parameters and 
	 * send value with the help of JSExecutor to that particular
	 * @param element
	 * @param value
	 */
	public static void sendKeysOfInteger(WebElement element, int value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		highlightelementBorderAndBackground(element);
		js.executeScript("arguments[0].value='" + value + "'", element);
	}

	/**
	 * This method will take element and String text and will
	 * select the value from static Drop down by visible value
	 * with the help of Select class
	 * @param element
	 * @param text
	 */
	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method will take element and integer index and will
	 * select the value from static Drop down by index
	 * with the help of Select class
	 * @param element
	 * @param index
	 */
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method will take element and String value and will
	 * select the value from static Drop down by value
	 * with the help of Select class
	 * @param element
	 * @param value
	 */
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method accepts alerts
	 */
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method dismiss alerts
	 */
	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method will switch web-driver from parent window to child
	 */
	public static void switchToWindow() {
		Set<String> WindowsHandles = driver.getWindowHandles();
		Iterator<String> it = WindowsHandles.iterator();
		String window = it.next();
		driver.switchTo().window(window);
	}

	/**
	 * This method will take an element and will return text
	 * of that particular element as String
	 * @param element
	 * @return
	 */
	public static String getText(WebElement element) {
		String ElementText = element.getText();
		return ElementText;
	}

	/**
	 * This method will drag and drop using Actions class by taking two
	 * elements one as source element and drop it to target element
	 * @param sourceElement
	 * @param targetElement
	 */
	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).perform();

	}
	
	/**
	 * this method will take screen shot of your driver current step
	 */
	public static void takeScreenshotForStep() {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		verify.attach(screenshot, "image/png", "Step Screenshot");
	}

}
