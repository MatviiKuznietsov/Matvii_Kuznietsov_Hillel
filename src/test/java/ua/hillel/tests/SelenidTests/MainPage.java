package ua.hillel.tests.SelenidTests;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.hillel.tests.LoadUploadFiles.DownLoadPage;
import ua.hillel.tests.LoadUploadFiles.UploadPage;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private SelenideElement fileDownload = $(By.linkText("File Download"));
    private SelenideElement fileUpload = $(By.linkText("File Upload"));
    private SelenideElement dynamicLoading = $(By.linkText("Dynamic Loading"));
    public DownLoadPage goFileDownload() {
        fileDownload.click();
        return new DownLoadPage();
    }

    public UploadPage gofileUpload() {
        fileUpload.click();
        return new UploadPage();
    }
    public DynamicallyLoadedPage goDynamicallyLoadedPage() {
        dynamicLoading.click();
        return new DynamicallyLoadedPage();
    }

}
