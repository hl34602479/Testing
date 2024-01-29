package pom;

import helpers.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class ClickButtonsPage extends BasePage implements DefaultPage {
    //selectores.
    final By clickMeButton1 = By.id("button1");
    final By clickMeButton2 = By.id("button2");
    final By clickMeButton3 = By.id("button3");
    final By closebutton = By.xpath("//*[@id=\"myModalMoveClick\"]/div/div/div[3]/button");
    final By closeButtonAlert = By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button");
    public final By contentModal = By.xpath("//*[@id=\"myModalClick\"]/div/div");
    public final By jSModal = By.xpath("//*[@id=\"myModalJSClick\"]/div/div");
    public final By lastModal = By.xpath("//*[@id=\"myModalMoveClick\"]/div/div");

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
        click(clickMeButton1);
    }

    public void clickMeButtonB(){
        click(clickMeButton2);
    }

    public void clickMeButtonC(){
        click(clickMeButton3);
    }

    public void clickClosePopUp() {
        click(closeButtonAlert);
    }

    public Boolean isModalADisplayed() {
        waitForElementVisible(contentModal);
        return isDisplayed(contentModal);
    }

    public Boolean isModalJsADisplayed(){
        waitForElementVisible(jSModal);
        return isDisplayed(jSModal);
    }

    public Boolean isLastModalDiplayed(){
        waitForElementVisible(lastModal);
        return  isDisplayed(lastModal);
    }

}
