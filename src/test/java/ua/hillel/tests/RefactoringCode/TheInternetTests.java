package ua.hillel.tests.RefactoringCode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TheInternetTests extends BaseTest {

    @Test
    public void LogInValidTest() {
        Assert.assertEquals(openMainPage()
                .goToLogInPage()
                .loginValid("tomsmith", "SuperSecretPassword!")
                .getValidSign().getText(),"You logged into a secure area!\n" + "×");

    }

    @Test
    public void testLogInInvalid() {
        Assert.assertEquals(openMainPage().goToLogInPage().loginInvalid("NoNameUser", "SMB_Password")
                .getInvalidSign().getText(), "Your username is invalid!\n" + "×");
    }

    @Test
    public void testCheckbox() {
        openMainPage().goToCheckboxes().checkboxesStatus();
    }

    @Test
    public void testClickButton() {
        openMainPage().goChallengingDOM()
                .clickFirstButton()
                .clickSecondButton()
                .clickThirdButton()
                .showСolumn();
    }

    @Test
    public void userNames() {
        openMainPage().goToHowers().showNamesPictures();
    }
}
