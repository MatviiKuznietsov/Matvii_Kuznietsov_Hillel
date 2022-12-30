package ua.hillel.tests.RefactoringCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HowersPage extends BasePage {
    @FindBy(css = "div.figure")
    private List<WebElement> figures;

    public HowersPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void showNamesPictures() {
        for (WebElement figure : figures) {
            actions.moveToElement(figure).pause(1000).perform();
            System.out.println(figure.getText()
                    .replaceAll("name: ", "")
                    .replaceAll("View profile", ""));
        }
    }
}