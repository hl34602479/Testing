package pom.base;

import org.openqa.selenium.By;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class ActionIndexPage extends BasePage implements DefaultPage {
    //Selectores.
    final By dropHereDiv = By.id("div-drag-drop-thumbnail");
    final By doubleClickDiv = By.id("double-click");
    final By mainHeader = By.id("main-header");
    final By clickBoxDiv = By.id("click-box");
    final By dragMeDiv = By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']");
    final By firstHoverButton = By.xpath("//button[.='Hover Over Me First!']");
    final By secondHoverButton = By.xpath("//button[.='Hover Over Me Second!']");
    final By thirdHoverButton = By.xpath("//button[.='Hover Over Me Third!']");
    final By secondHiddenLink1FromThirdAlertList = By.xpath("//div[@ID='div-hover']/parent::div//a[2]"); //a[.='Link 1']/following-sibling::*"); preguntar a Fede porque funciona tambien.
    final By hiddenLink1FromFirstAlertList = By.xpath("//div[@id='div-hover']/div[1]/div/a");
    final By hiddenLink1FromSecondAlertList = By.xpath("//div[@id='div-hover']/div[2]/div/a");
    final By firstHiddenLink1FromThirdAlertList = By.xpath("//div[@id='div-hover']/div[3]//a[1]");


    //obligatorios del pom
    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/Actions/index.html";
    }

    @SafeVarargs
    public final <T> void load(T... values) {
        visit(getUrl(values));
    }

    //Métodos.
    public String getTextFromDoubleClickBox(){
        waitForElementVisible(doubleClickDiv);
        return getText(doubleClickDiv);
    }

    public void clickOnBox(){
        waitForElementVisible(clickBoxDiv);
        click(clickBoxDiv);
    }

    public String getTextFromClickBox() {
        waitForElementVisible(clickBoxDiv);
        return getText(clickBoxDiv);

    }
}

