package pompages;

import wrappers.GenericWrappers;

public class IrctcPackageDetails extends GenericWrappers {
	public void tourStartingDate(String date) {
		//clickByXpath("//*[contains(@name,'country')]");
		selectVisibleTextByXpath("//*[contains(@name,'country')]",date);
		
	
}
	public void boardingStation( String boardingStation ) {
		//clickByName("boardst");
		//selectVisibleTextByXpath(xpath,station);
		selectVisibleTextByXpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[3]/select", boardingStation);
	
	}
	public void deBoardingStation( String deboardingStation) {
		//clickByName("deBoardst");
		selectVisibleTextByXpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[5]/select", deboardingStation);
	}
	public void continueButton() throws InterruptedException {
		clickByXpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[8]/button");
		Thread.sleep(1000);
	}
	public void roomSelection(String selectNoOfAdults) {
		//clickById("selectID0");
		//selectVisibleTextByXpath(xpath, text);
		selectVisibileTextById("selectID0", selectNoOfAdults);
	}
	public void clickBookButton() {
		clickByXpath("//*[contains(@type,'button')]");
	}

}



