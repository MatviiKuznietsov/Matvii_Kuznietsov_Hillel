package ua.hillel.tests;

import org.testng.annotations.Test;

import javax.swing.*;

public class PageTestAction extends BaseTest {
    @Test
    public void dragElements() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
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
