package ua.hillel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class PageTestAction extends BaseTest {
    @Test
    public void dragElements() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
        WebElement dragFrame = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
        WebElement enterFrame = driver.findElement(By.xpath("//*[@id='droppable']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragFrame,enterFrame).perform();
    }


    @Test
    public void dropDownMenu() {
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");
    }

    @Test
    public void userName() {
        driver.get("https://the-internet.herokuapp.com/hovers");

    }
}
