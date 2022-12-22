package ua.hillel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class TestsLocators extends BaseTest{

    @Test
    public void testClickButton() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        driver.findElement(By.cssSelector("div a:nth-of-type(1).button")).click();
        driver.findElement(By.cssSelector(".button.alert")).click();
        driver.findElement(By.cssSelector(".button.success")).click();
        List<String> tableMeans = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            tableMeans.add(driver.findElement(By.cssSelector("tbody tr:nth-of-type(" + i + ") td:nth-of-type(4)")).getText());
        }
        System.out.println(tableMeans);
    }

    @Test
    public void testLogInValid() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='flash success']")).getText(), "You logged into a secure area!\n" + "×");
    }

    @Test
    public void testLogInInvalid() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("NoNameUser");
        driver.findElement(By.id("password")).sendKeys("SMB_Password");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertEquals(driver.findElement(By.cssSelector(".flash.error")).getText(), "Your username is invalid!\n" + "×");
    }

    @Test
    public void testCheckbox() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        for (int i = 1; i <= 2; i++) {
            if (driver.findElement(By.xpath("//input[" + i + "]")).isSelected()) {
                System.out.println("Checkbox " + i + " = OFF");
            } else {
                System.out.println("Checkbox " + i + " = ON");
            }
        }
    }


}

