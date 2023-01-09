package ua.hillel.tests.SelenidTests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownUploadSelenidTest extends BaseClassSelenide {
    public SelenideElement nameFileElement = $(By.linkText("b.txt"));
    public File file;

    @Test(priority = 10)
    public void downLoadTest() throws FileNotFoundException {
        open("/download");
        file = nameFileElement.download();
        System.out.println(file.getAbsolutePath());
    }

    @Test(priority = 20)
    public void uploadTest() throws IOException {
        open("/upload");
        UploadPage uploadPage = new UploadPage();
        uploadPage.uploadFile(writeToFile(file)).clickUploadButton();
    }

    @Test (priority = 100)
    public void checkDunamicElements1() {
        open("/dynamic_loading");
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        String textCheking1 = dynamicallyLoadedPage.goToExample1().clickButtonStart1().getSign1();
        Assert.assertEquals(textCheking1, "Hello World!");
    }

    @Test (priority = 100)
    public void checkDunamicElements2() {
        open("/dynamic_loading");
        DynamicallyLoadedPage dynamicallyLoadedPage = new DynamicallyLoadedPage();
        String textCheking2 = dynamicallyLoadedPage.goToExample2().clickButtonStart2().getSign2();
        Assert.assertEquals(textCheking2, "Hello World!");
    }

    public File writeToFile(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath());
        Date date = new Date();
        for (int i = 0; i < 3; i++) {
            lines.add("Whrite new lines in file" + date);
            Files.write(file.toPath(), lines);
        }
        file.deleteOnExit();
        return file;
    }


}
