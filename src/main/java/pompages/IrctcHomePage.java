package pompages;

import wrappers.GenericWrappers;

public class IrctcHomePage extends GenericWrappers {
	
//	public IrctcHomePage invokeApp() {
//		invokeApp("chrome", "https://www.irctc.co.in/nget/train-search");
//		threadwait();
//		clickByXpath(
//				"/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
//		threadwait();
//		return this;
//	}

	public IrctcHomePage clickOnRegister() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
		return this;
		
	}
	
	
	public IrctcHomePage mouseOverOnHolidays() {
		mouseover("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
		threadwait(2000);
		return new IrctcHomePage();
	}
	public IrctcHomePage mouseOverOnPackages() {
		mouseover("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[2]/a/span[1]");
		return new IrctcHomePage();
	}
	public IrctcTourism clickOnTourpackages() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[2]/ul/li[1]/a/span");
		threadwait(2000);
		switchToLastWindow();
		return new IrctcTourism();
		
	}

	
	
	
}