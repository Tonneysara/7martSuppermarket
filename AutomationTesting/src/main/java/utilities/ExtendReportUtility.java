package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {

	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {

		ExtentSparkReporter reporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "./extent-reports/extent-report.html");

		reporter.config().setReportName("SevenMartSupermarket");

		extentReports.attachReporter(reporter);

		extentReports.setSystemInfo("organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Tonney");

		return extentReports;
	}
}
