package ua.hillel.tests.RefactoringCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChallengingDomPage extends BasePage {
    @FindBy(css = "div a:nth-of-type(1).button")
    private WebElement firstButton;
    @FindBy(css = ".button.alert")
    private WebElement secondButton;
    @FindBy(css = ".button.success")
    private WebElement thirdButton;
    @FindBy(css = "tbody td:nth-of-type(4)")
    private List<WebElement> numbers;


    public ChallengingDomPage() {
        PageFactory.initElements(driver, this);
    }
    public ChallengingDomPage clickFirstButton(){
        clickButton(firstButton);
        return new ChallengingDomPage();
    }
    public ChallengingDomPage clickSecondButton(){
        clickButton(secondButton);
        return new ChallengingDomPage();
    }
    public ChallengingDomPage clickThirdButton(){
        clickButton(thirdButton);
        return new ChallengingDomPage();
    }
    public void showСolumn(){
        for (WebElement number : numbers) {
            System.out.println(number.getText());
        }
    }
}
