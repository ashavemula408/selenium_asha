package pompages;

import wrappers.GenericWrappers;

public class IrctcTourism extends GenericWrappers {
	
	public IrctcTourism selectOrigin(String city) {
		threadwait(5000);
		clickByXpath("//label[contains(text(),'"+city.toUpperCase()+"')]");
		//clickById("chk5");
		threadwait(1000);
		return this;
	
	}
	
	public GuestUserLogin bookNow()  {
		clickByXpath("/html/body/app-root/tourpackagelist/div[2]/div/div[3]/div/div[2]/div/div[3]/div/a[2]");
		return new GuestUserLogin();
	}
}
