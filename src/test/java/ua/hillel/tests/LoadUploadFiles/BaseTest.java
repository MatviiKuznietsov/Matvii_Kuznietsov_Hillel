package ua.hillel.tests.LoadUploadFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ua.hillel.tests.listeners.CustomExtentReportListener;
import ua.hillel.tests.utils.DriverHolder;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
@Listeners(CustomExtentReportListener.class)
public class BaseTest {
    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/Extent.Html");
    }
    protected WebDriver driver;

    @BeforeClass
    public void SetUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", new File("target/download/").getAbsolutePath());
        options.setExperimentalOption("prefs", prefs);

        this.driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        DriverHolder.setDriver(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            //driver.quit();
        }
    }

    public MainPage openMainPage() {
        driver.get("https://the-internet.herokuapp.com");
        return new ua.hillel.tests.LoadUploadFiles.MainPage();
    }
}
