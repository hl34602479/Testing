package pom;

import groovyjarjarasm.asm.tree.TryCatchBlockNode;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class PageObjectModelIndexPage  extends BasePage implements DefaultPage {
    //Selectores.

    final By leftSpanButton = By.xpath("//*/a[1]/span");
    final By rightSpanButton = By.xpath("//*/a[2]/span");
    final By firstLiButton = By.xpath("//*/ol/li[1]");
    final By secondLiButton = By.xpath("//*/ol/li[2]");
    final By thirdLiButton = By.xpath("//*/ol/li[3]");
    final By firstDivObject = By.xpath("/html/body/div[1]/div/div/div[2]/div[1]");
    final By secondDivObject = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]");
    final By thirdDivObject = By.xpath("/html/body/div[1]/div/div/div[2]/div[3]");
    final By fourthDivObject = By.xpath("/html/body/div[1]/div/div/div[2]/div[4]");
    final By firstText = By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/p");


    //obligatorios del pom

    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/Page-Object-Model/index.html";
    }

    @SafeVarargs
    public final <T> void load(T... values) {
        visit(getUrl(values));
    }

    //Métodos.

    public Boolean isLeftSpanDisplayed() {
        waitForElementVisible(leftSpanButton);
        return isDisplayed(leftSpanButton);
    }

    public Boolean isRightSpanDisplayed() {
        waitForElementVisible(rightSpanButton);
        return isDisplayed(rightSpanButton);
    }

    public Boolean areLeftAndRightDisplayed() {
        waitForElementVisible(leftSpanButton);
        waitForElementVisible(rightSpanButton);
        return isDisplayed(leftSpanButton) && isDisplayed(rightSpanButton);
    }

    public Boolean areLiFirstSecondAndThirdDisplayedOk() {
        waitForElementVisible(firstLiButton);
        waitForElementVisible(secondLiButton);
        waitForElementVisible(thirdLiButton);

        return isDisplayed(leftSpanButton) && isDisplayed(rightSpanButton) && isDisplayed(thirdLiButton);
    }

    public Boolean areFirstSecondAndThirdLiDisplayedOk() {
        waitForElementVisible(firstLiButton);
        waitForElementVisible(secondLiButton);
        waitForElementVisible(thirdLiButton);

        return isDisplayed(leftSpanButton) && isDisplayed(rightSpanButton) && isDisplayed(thirdLiButton);
    }

    public Boolean areFirstSecondThirdFourthDivDisplayedOk() {
        waitForElementVisible(firstDivObject);
        waitForElementVisible(secondDivObject);
        waitForElementVisible(thirdDivObject);
        waitForElementVisible(fourthDivObject);

        return isDisplayed(firstDivObject) && isDisplayed(secondDivObject) && isDisplayed(thirdDivObject) && isDisplayed(fourthDivObject);
    }

    public boolean isTextVisible(WebElement firstText) {
        try {
            return firstText.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException |
                 org.openqa.selenium.ElementNotVisibleException e) {
            return false;
        }
    }

}




