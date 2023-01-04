package ua.hillel.tests.LoadUploadFiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;

public class UploadPage extends BasePage{
    @FindBy (id = "file-upload")
    WebElement browseButton;
    @FindBy (id = "file-submit")
    WebElement uploadButton;
    @FindBy (id = "drag-drop-upload")
    WebElement downloadArea;

    public UploadPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickBrowseButton(){
        clickButton(browseButton);
    }
    public UploadPage setArrivedFile(String pathFile){
        browseButton.sendKeys((new File(pathFile).getAbsolutePath()));
        return new UploadPage();
    }
    public void clickUploadButton(){
        clickButton(uploadButton);
    }
    public void clickDownloadArea(){
        clickButton(downloadArea);
    }
}
