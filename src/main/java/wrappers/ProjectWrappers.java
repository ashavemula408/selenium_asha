package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.IrctcHomePage;

public class ProjectWrappers extends GenericWrappers{
	 
	@BeforeMethod
	public void beforeMethod() {
	   invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
	   threadwait(2000);
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		threadwait(2000);
		
}
	
//	@AfterMethod
//	public void afterMethod() {
//		closeAllBrowsers();
//	}
}