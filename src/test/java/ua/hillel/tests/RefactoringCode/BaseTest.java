package ua.hillel.tests.RefactoringCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import ua.hillel.tests.listeners.CustomExtentReportListener;
import ua.hillel.tests.utils.DriverHolder;

@Listeners(CustomExtentReportListener.class)

public class BaseTest {
    protected WebDriver driver;

    static {
        System.setProperty("extent.reporter.html.start", "true");
        System.setProperty("extent.reporter.html.out", "target/extentReport/Extent.Html");
    }

    @BeforeClass
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        DriverHolder.setDriver(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public MainPage openMainPage() {
        driver.get("https://the-internet.herokuapp.com");
        return new MainPage();
    }
}
