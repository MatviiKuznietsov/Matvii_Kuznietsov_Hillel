package ua.hillel.tests.LoadUploadFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DownLoadPage extends BasePage{

    public DownLoadPage() {
        PageFactory.initElements(driver, this);
    }
    public void clickObject (String nameDownLoadObject){

        WebElement sign =driver.findElement(By.linkText(nameDownLoadObject));
        clickButton(sign);
    }
}
