package wrappers;

import org.testng.annotations.Test;

public class IrctcBus extends GenericWrappers {

	@Test
	public void testIrctc() throws InterruptedException {
		invokeApp("Chrome", "https://www.irctc.co.in/nget/train-searchhttps://www.irctc.co.in/nget/train-search");
	    clickByXpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button");
		 
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[4]/a");
		switchToLastWindow();
		Thread.sleep(1000);
		enterByXpath("/html/body/app-root/ng-component/div[3]/div[2]/div[2]/form/div[1]/input", "hyde");
		Thread.sleep(1000);
		clickByXpath("/html/body/ul[1]/li[1]/div");
		enterByXpath("/html/body/app-root/ng-component/div[3]/div[2]/div[2]/form/div[2]/input", "vij");
		Thread.sleep(1000);
		clickByXpath("/html/body/ul[2]/li[1]/div");
		clickByXpath("/html/body/app-root/ng-component/div[3]/div[2]/div[2]/form/div[3]/input");
		clickByXpath("/html/body/div[3]/table/tbody/tr[3]/td[6]/a");
		clickByXpath("/html/body/app-root/ng-component/div[3]/div[2]/div[2]/form/div[4]/button");
		Thread.sleep(1000);
	}
}
