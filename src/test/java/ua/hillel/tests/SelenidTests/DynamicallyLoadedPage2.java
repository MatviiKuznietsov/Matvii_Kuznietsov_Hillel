package ua.hillel.tests.SelenidTests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicallyLoadedPage2 {
    private SelenideElement buttonStart = $x("//button[contains(text(),'Start')]");
    private SelenideElement signHelloWorld = $x("//h4[contains(text(),'Hello World!')]");

    public DynamicallyLoadedPage2 clickButtonStart2() {
        buttonStart.shouldBe(Condition.visible).click();
        return new DynamicallyLoadedPage2();
    }

    public String getSign2() {
        return signHelloWorld.shouldBe(Condition.visible).getText();
    }
}
