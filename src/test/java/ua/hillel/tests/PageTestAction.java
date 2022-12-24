package ua.hillel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PageTestAction extends BaseTest {
    @Test
    public void dragElements() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement dragFrame = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement enterFrame = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions action = new Actions(driver);
        action.pause(2000).dragAndDrop(dragFrame, enterFrame).pause(2000).perform();
        Assert.assertEquals(driver.findElement(By.xpath(".//p[contains(text(),'Dropped')]")).getText(), "Dropped!");
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
    public void userNames() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://the-internet.herokuapp.com/hovers");
        List<WebElement> figures = driver.findElements(By.cssSelector("div.figure"));
        Actions actions = new Actions(driver);
        for (WebElement figure : figures) {
            actions.moveToElement(figure).pause(1000).perform();
            System.out.println(figure.findElement(By.tagName("h5")).getText().replaceAll("name: ", ""));
        }
    }
}







