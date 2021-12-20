package wrappers;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DataProvider_FBAccount;
import wrappers.GenericWrappers;

public class FbAccount extends GenericWrappers {

	//public static void main(String[] args) throws InterruptedException {
	
	@Test(dataProvider="testcase1",dataProviderClass=DataProvider_FBAccount.class)
	public void testFB(String Firstname, String Lastname, String Mobilenum ,String Newpassword,String month,String day,String year,String gender) throws InterruptedException {
		
	//GenericWrappers obj= new GenericWrappers();
	invokeApp("chrome", "https://www.facebook.com/");
	System.out.println(getTitleOfPage());
	
	clickByXpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/d/div[5]/a");
	Thread.sleep(1000);
	enterByName("firstname", Firstname);
	enterByName("lastname", Lastname);
	enterByName("reg_email__", Mobilenum);
	
	enterById("password_step_input", Newpassword);
	
	
	
	selectVisibileTextById("month",month);
	selectVisibileTextById("day",day);
	selectVisibileTextById("year", year);
	
	if(gender.equalsIgnoreCase("Female"))
	{
		clickByXpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[1]/input");
	}
	else
	{
		clickByXpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input");
	}
	Thread.sleep(2000);
	closeBrowser();
	}
	
//	//@Test(enabled=false)
//	public void mouseOver() throws InterruptedException {
//		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
//		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
//		Thread.sleep(1000);
//		mouseover("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
//		
//	}
//	
//	@Test
//	public void ebaymouseOver() throws InterruptedException {
//		invokeApp("chrome", "https://www.ebay.com/");
//		mouseover("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a");
//		Thread.sleep(1000);
//		clickByXpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/div[2]/div[1]/nav[2]/ul/li[2]/a");
//		
//	}

}
