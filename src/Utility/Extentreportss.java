package Utility;
import com.relevantcodes.extentreports.ExtentReports;
public class Extentreportss {

    /**
     * Created by tct4 on 8/12/2016.
     */
    public class initExtentReport {
        static ExtentReports extent;
        public static ExtentReports init()
        {
            extent = new ExtentReports("D:\\PROJECT\\DriverTSoft\\Extent-report\\Login\\report.html",false/*, NetworkMode.OFFLINE*/);

            return extent;
        }
    }
}
