package ua.hillel.tests.LoadUploadFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ua.hillel.tests.RefactoringCode.*;

public class MainPage extends BasePage {
    @FindBy(linkText = "File Download")
    private WebElement fileDownload;
    @FindBy(linkText = "File Upload")
    private WebElement fileUpload;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public DownLoadPage goFileDownload() {
        clickButton(fileDownload);
        return new DownLoadPage();
    }

    public UploadPage gofileUpload() {
        clickButton(fileUpload);
        return new UploadPage();
    }


}
