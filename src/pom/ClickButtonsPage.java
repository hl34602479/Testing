package pom;

import org.openqa.selenium.By;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class ClickButtonsPage extends BasePage implements DefaultPage {
    //selectores.
    final By clickMeButton1 = By.xpath("//*[@id=\"button1\"]/p");
    final By clickMeButton2 = By.id("button2");
    final By clickMeButton3 = By.id("button3");

    //obligatorios del pom
    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/Click-Buttons/index.html";
    }
    @SafeVarargs
    public final <T> void load(T... values) {
        visit(getUrl(values));
    }

    //Métodos.
    public void clickMeButtonA() {
        click(clickMeButton1);}

}