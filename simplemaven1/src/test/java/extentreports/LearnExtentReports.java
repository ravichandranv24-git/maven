package extentreports;

import java.time.LocalDateTime;

import org.apache.poi.hssf.record.common.ExtendedColor;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReports {
	@Test
	
	public void createReport() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		// step 1:create ExtentSparkReporter object
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/ExtentReport_"+timestamp+".html");
		// step 2:create ExtentReports object
		ExtentReports ereport = new ExtentReports();
		//step 3:attach ExtentSparkReporter to ExtentReports
		ereport.attachReporter(spark);
		//step 4:create ExtentTest object
		ExtentTest test = ereport.createTest("createReport");
		// step 5:call log(Status,"message")
		test.log(Status.PASS,"message added into report");
		test.log(Status.FAIL, "Testscript is Failed");
		// step 6: call flash()
		ereport.flush();
		
		
	}

}
