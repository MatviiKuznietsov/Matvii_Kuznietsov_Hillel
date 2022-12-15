package ua.hillel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestsLocators {
    WebDriver driver = new ChromeDriver();

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
        Assert.assertEquals("You logged into a secure area!\n" + "×", driver.findElement(By.xpath("//div[@class='flash success']")).getText());
    }

    @Test
    public void testLogInInvalid() {
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("NoNameUser");
        driver.findElement(By.id("password")).sendKeys("SMB_Password");
        driver.findElement(By.cssSelector(".radius")).click();
        Assert.assertEquals("Your username is invalid!\n" + "×", driver.findElement(By.cssSelector(".flash.error")).getText());
    }

    @Test
    public void testCheckbox() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<String> checkboxStatus = new ArrayList();
        for (int i = 1; i <= 2; i++) {
            checkboxStatus.add(driver.findElement(By.xpath("//input[" + i + "]")).getAttribute("checked"));
        }
        for (String i : checkboxStatus) {
            int x = checkboxStatus.indexOf(i) + 1;
            if (i == null) {
                System.out.println("Checkbox " + x + " = OFF");
            } else
                System.out.println("Checkbox " + x + " = ON");
        }
    }

    @BeforeTest
    public void Preparation() {
        WebDriverManager.chromedriver().setup();

    }

    @AfterTest
    public void endWork() {
        driver.close();
    }
}

