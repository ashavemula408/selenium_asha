package wrappers;

import java.sql.Driver;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utilities.Reports;

public class GenericWrappers extends Reports implements Wrappers {

	static RemoteWebDriver driver;

	@Override
	public  void invokeApp(String browser, String url) {
		try {
		
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/Users/pa3l91m/eclipse-workspace/framework/Drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Internetexplorer")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/internetexplorerdriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		logStatusReport("pass", "Browser launched succesfully");
	} catch(NoSuchSessionException e) {
		logStatusReport("Fail","There is no session created,please check browser and chromedriver versions");
		
	} catch(TimeoutException e) {
		logStatusReport("Fail","Application is taking too long to load");
		
		
	} catch(WebDriverException e) {
		logStatusReport("Fail","The browser not launched");
		
	}
	}
	@Override
	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			System.out.println("Data entered");
			
		} catch (NoSuchElementException e) {
			System.out.println("No element found to enter data");
			
		}
		
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			System.out.println("Data entered successfully");
		} catch (NoSuchElementException e) {
			System.out.println("Data cannot be entered");
			
		}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		driver.findElementByXPath(xpathValue).sendKeys(data);
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stubq
		String Title1 = driver.getTitle();
		if (Title1.equalsIgnoreCase(title)) {
			System.out.println("title is same");
		} else {
			System.out.println("title is diffrent");
		}
	}
	
	public String getTitleOfPage() {
		String Title=driver.getTitle();
		return Title;
	}
	
	public void mouseover(String value) {
		System.out.println(driver);
		Actions act= new Actions(driver);
		WebElement target= driver.findElementByXPath(value);
		try {
			act.moveToElement(target).perform();
			System.out.println("MouseOver sucessful");
		} catch (NoSuchElementException e) {
			System.out.println("Mouseover not done");
			e.printStackTrace();
		}
	}
	
	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		String actual = driver.findElementById(id).getText();
		if (actual.equalsIgnoreCase(text)) {
			System.out.println("text matched");
		} else {
			System.out.println("text not matched");
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String actual = driver.findElementByXPath(xpath).getText();
		if (actual.equalsIgnoreCase(text)) {
			System.out.println("text is matched");

		} else {
			System.out.println("text not matched");
		}
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		String actual = driver.findElementByXPath(xpath).getText();
		if (actual.contains(text)) {
			System.out.println("matched");

		} else {
			System.out.println("not matched");
		}
	}

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(id).click();
			System.out.println("Element clicked Sucessfully");
		} catch (NoSuchElementException e) {
			System.out.println("Element not clicked");
			
		}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		driver.findElementByClassName(classVal).click();
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		driver.findElementByName(name).click();
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(name).click();
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		// TODO Auto-generated method stub
		driver.findElementByLinkText(name).click();
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			System.out.println("Element Clicked sucessfully");
		} catch (NoSuchElementException e) {
			System.out.println("The Element is not clicked");
			e.printStackTrace();
		}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		String actual = driver.findElementById(idVal).getText();
		return actual;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		String actual = driver.findElementByXPath(xpathVal).getText();
		return actual;
	}

	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		WebElement element = driver.findElementById(id);
		Select obj = new Select(element);
		obj.selectByVisibleText(value);
	}
	public void selectVisibleTextByXpath(String Xpath, String text) {
		WebElement element=driver.findElementByXPath(Xpath);
		Select obj6= new Select(element);
		obj6.selectByVisibleText(text);
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		WebElement index = driver.findElementById(id);
		Select obj1 = new Select(index);
		obj1.selectByIndex(value);
	}

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		Set<String> allWindows=driver.getWindowHandles();
	
		for(String a: allWindows) {
			driver.switchTo().window(a);
			break;
		}
	}

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		Set<String> allWindows= driver.getWindowHandles();
		for(String a: allWindows) {
			driver.switchTo().window(a);
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
	String text= driver.switchTo().alert().getText();
		return text;
	}

	@Override
	public void takeSnap() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}
	public void threadwait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	

}
