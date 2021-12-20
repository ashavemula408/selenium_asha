package utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reports {
	
	ExtentReports report;
	ExtentTest test;
	String testcaseName,testcasedescription,Author,Category;
	
	public void startReports() {
		 report= new ExtentReports("./Reports/Reports.html");
		
	}
		
	public void startTest() {
		 test= report.startTest(testcaseName, testcasedescription);
		test.assignAuthor(Author);
		test.assignCategory(Category);
	}
	public void logStatusReport(String status,String description) {
		if(status.equalsIgnoreCase("pass")) {
			test.log(LogStatus.PASS,description);
		}
		else if(status.equalsIgnoreCase("Fail")){
			test.log(LogStatus.FAIL, description);
			
		}
		else if(status.equalsIgnoreCase("Warning")) {
			test.log(LogStatus.WARNING, description);

			
		}
		
		
	}
	public void endTest() {
		report.endTest(test);
	}
	public void endReport() {
		report.flush();
	}

}
