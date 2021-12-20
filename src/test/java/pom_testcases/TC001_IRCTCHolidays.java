package pom_testcases;

import org.testng.annotations.Test;

import pompages.IrctcHomePage;
import wrappers.ProjectWrappers;



@Test
public class TC001_IRCTCHolidays extends ProjectWrappers  {
	public void tourPackages() {
	IrctcHomePage obj = new IrctcHomePage();
	obj.mouseOverOnHolidays().mouseOverOnPackages().clickOnTourpackages().selectOrigin("CHENNAI ").bookNow();
//	obj.mouseOverOnPackages();
//	obj.clickOnTourpackages();
//	IrctcTourism obj1 = new IrctcTourism();
//	obj1.selectOrigin();
//	obj1.bookNow();
		

		
	}
	

}
