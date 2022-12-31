package ua.hillel.tests.RefactoringCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckboxesPage extends BasePage{
    @FindBy (id = "checkboxes")
    List<WebElement> boxes;

    public CheckboxesPage (){
        PageFactory.initElements(driver, this);
    }
    public void checkboxesStatus (){
        for (WebElement box : boxes) {
            System.out.println(box.getText() +" is "+ box.isEnabled());
        }
    }
}
