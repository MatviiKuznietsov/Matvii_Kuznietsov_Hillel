package ua.hillel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PageTestAction extends BaseTest {
    @Test
    public void dragElements() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement dragFrame = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement enterFrame = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions action = new Actions(driver);
        action.pause(2000).dragAndDrop(dragFrame, enterFrame).pause(2000).perform();
    }


    @Test
    public void dropDownMenu() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
        WebElement dropDown = driver.findElement(By.cssSelector(".dropdown-toggle"));
        WebElement secondaryMenu = driver.findElement(By.xpath(".//*[text()='Secondary Menu ']"));
        WebElement secondaryAction = driver.findElement(By.xpath(".//*[text()='Secondary Action']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dropDown)
                .pause(1000)
                .moveToElement(secondaryMenu)
                .pause(1000)
                .click(secondaryAction)
                .perform();
        Assert.assertEquals(driver.findElement(By.xpath(".//*[text()='Secondary Page']")).getText(), "Secondary Page");
    }


    @Test
    public void userName() {
        driver.get("https://the-internet.herokuapp.com/hovers");
        WebElement picture1 = driver.findElement(By.cssSelector("div.figure:nth-of-type(1)"));
        WebElement picture2 = driver.findElement(By.cssSelector("div.figure:nth-of-type(2)"));
        WebElement picture3 = driver.findElement(By.cssSelector("div.figure:nth-of-type(3)"));
        Actions actions = new Actions(driver);
        actions.moveToElement(picture1)
                .pause(1000)
                .moveToElement(picture2)
                .pause(1000)
                .moveToElement(picture3)
                .pause(1000)
                .perform();


    }
}
