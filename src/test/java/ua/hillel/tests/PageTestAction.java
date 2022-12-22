package ua.hillel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;

public class PageTestAction extends BaseTest {
    @Test
    public void dragElements() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement dragFrame = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement enterFrame = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragFrame, enterFrame).pause(3000).perform();
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
        Assert.assertEquals(driver.findElement(By.xpath(".//*[text()='Secondary Page']")).getText(),"Secondary Page");
    }


    @Test
    public void userName() {
        driver.get("https://the-internet.herokuapp.com/hovers");

    }
}
