package ua.hillel.tests.RefactoringCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {
    @FindBy(linkText = "Challenging DOM")
    private WebElement challengingDOM;
    @FindBy(linkText = "Form Authentication")
    private WebElement formAuthentication;
    @FindBy(linkText = "Checkboxes")
    private WebElement checkboxes;
    @FindBy(linkText = "Hovers")
    private WebElement hovers;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ChallengingDomPage goChallengingDOM() {
        clickButton(challengingDOM);
        return new ChallengingDomPage(driver);
    }

    public LogInPage goToLogInPage() {
        clickButton(formAuthentication);
        return new LogInPage(driver);
    }

    public CheckboxesPage goToCheckboxes() {
        clickButton(checkboxes);
        return new CheckboxesPage(driver);
    }

    public HowersPage goToHowers() {
        clickButton(hovers);
        return new HowersPage(driver);
    }

}
