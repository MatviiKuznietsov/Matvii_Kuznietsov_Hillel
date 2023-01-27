package ua.hillel.tests.LoadUploadFiles;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Date;
import java.util.List;

public class DownUploadTests extends BaseTest {
    public String nameFile = "test.txt";
    public String pathToFile = "target/download/";

    @Test
    public void downloadtest() throws InterruptedException {
        openMainPage().goFileDownload().clickObject(nameFile);
        Thread.sleep(2000);

    }

    @Test
    public void upLoadtest() throws InterruptedException, IOException {
        writeToFile();
        openMainPage().gofileUpload().setArrivedFile(new File(pathToFile + nameFile)).clickUploadButton();
        Thread.sleep(2000);

    }

    public void  writeToFile() throws IOException {
        File file = new File(pathToFile + nameFile);
        List<String> lines = Files.readAllLines(file.toPath());
        Date date = new Date();
        for (int i = 0; i < 3; i++) {
            lines.add("Whrite new lines in file" + date);
            Files.write(file.toPath(), lines);
        }
        file.deleteOnExit();
    }

}
