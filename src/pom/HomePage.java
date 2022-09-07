package pom;

import helpers.BrowserDriver;
import org.openqa.selenium.By;
import pom.BasePage;
import pom.DefaultPage;

import java.util.Arrays;

public class HomePage extends BasePage implements DefaultPage {
    //selectores
    final By nameInput = By.xpath("//input[@name='wpforms[fields][0]']");
    final By sendButton = By.xpath("//button[@name='wpforms[submit]']");

    //obligatorios del pom
    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://tenzzen.com";
    }

    @SafeVarargs
    public final <T> void load(T... values){
        visit(getUrl(values));
    }

    @Override
    public boolean validateField(String element, String attribute, String value) {
        return false;
    }

    //métodos
    public String getButtonText() {
        waitForElementVisible(nameInput);
        return getText(sendButton);
    }

    public void writeForm() throws InterruptedException {
        Thread.sleep(2500);
        waitForElementVisible(nameInput);
        //Esto es usando el helper que hizo Agus.
        //sendKeys("Fede", nameInput);
        //Esta es la forma normal que se ve en todas partes.
        BrowserDriver.getDriver().findElement(nameInput).sendKeys("hernan");
        Thread.sleep(5000);
        click(sendButton);
    }
}
