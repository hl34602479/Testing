package pom;

import org.openqa.selenium.By;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class LoginPortalPage extends BasePage implements DefaultPage {
    //selectores.
    final By usernameInput = By.id("text");
    final By passwordInput = By.id("password");
    final By loginButton = By.id("login-button");

    //obligatorios del pom
    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/Login-Portal/index.html";
    }
    @SafeVarargs
    public final <T> void load(T... values) {
        visit(getUrl(values));
    }

    //Métodos.
    public void fillUsername(String username) {
        sendKeys(username, usernameInput);
    }

    public void fillPassword(String password) {
        sendKeys(password, passwordInput);
    }

    public void clickLogin() {
        click(loginButton);
    }
}