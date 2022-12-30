package ua.hillel.tests.RefactoringCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPage extends BasePage {
    @FindBy(id = "username")
    private WebElement userName;
    @FindBy(id = "password")
    private WebElement passWord;
    @FindBy(css = ".radius")
    private WebElement radius;
    @FindBy(css = ".flash.error")
    private WebElement signRejection;

    public LogInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String username) {
        userName.sendKeys(username);
    }

    public void setPassword(String password) {
        passWord.sendKeys(password);
    }

    public SecureAreaPage clickLoginButton() {
        radius.click();
        return new SecureAreaPage(driver);
    }

    public SecureAreaPage loginValid(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public LogInPage loginInvalid(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickButton(radius);
        return new LogInPage(driver);
    }

    public void signChekingInvalid() {
        Assert.assertEquals(signRejection.getText(), "Your username is invalid!\n" + "×");
    }
}
