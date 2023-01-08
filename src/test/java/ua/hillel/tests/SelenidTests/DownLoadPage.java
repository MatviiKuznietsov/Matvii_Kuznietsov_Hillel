package ua.hillel.tests.SelenidTests;

import com.codeborne.selenide.SelenideElement;

public class DownLoadPage {
    public void clickFileToDownload(SelenideElement fileToDownload) {
        fileToDownload.click();
    }
}
