package TSTNG.ExtLisScrenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.BeforeClass;

public class extentutil {
    @BeforeClass
    public static ExtentReports initExtentReport() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Reports/report8.html");
        ExtentReports extent = new ExtentReports();


        reporter.config().setReportName("All regression tests");
        reporter.config().setDocumentTitle("All types of websites");
        extent.attachReporter(reporter);

        extent.setSystemInfo("Developers name", "kapil1");
        extent.setSystemInfo("Test Manager name", "kapil2");
        extent.setSystemInfo("Test Lead name", "kapil3");
        extent.setSystemInfo("Project Manager name", "kapil4");
        return extent;
    }
}
