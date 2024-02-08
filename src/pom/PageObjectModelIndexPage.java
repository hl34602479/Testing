package pom;

import org.openqa.selenium.By;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class PageObjectModelIndexPage  extends BasePage implements DefaultPage {
    //Selectores.

    final By leftSpanButton = By.xpath("//a[@data-slide='prev']");
    final By rightSpanButton = By.xpath("//a[@data-slide='next']");
    final By firstLiButton = By.xpath("//li[@data-slide-to='0']");
    final By secondLiButton = By.xpath("//li[@data-slide-to='1']");
    final By thirdLiButton = By.xpath("//li[@data-slide-to='2']");
    final By firstDivObject = By.xpath("//p[.='Who Are We?']/parent::div/parent::div/parent::div");
    final By secondDivObject = By.xpath("//p[.='GREAT SERVICE!']/parent::div/parent::div/parent::div");
    final By thirdDivObject = By.xpath("//p[.='Why Choose Us?']/parent::div/parent::div/parent::div");
    final By fourthDivObject = By.xpath("//p[.='Excellent Customer Service!']/parent::div/parent::div/parent::div");
    final By firstText = By.xpath("//p[.='Who Are We?']");
    final By secondText = By.xpath("//p[.='GREAT SERVICE!']");
    final By firstStarSpan = By.xpath("//div[@class='div-star']//span[contains(@class, 'glyphicon glyphicon-star')]");
    final By secondStarSpan = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div//span[2]");
    final By thirdStarSpan = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div//span[3]");
    final By fourthStarSpan = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div//span[4]");
    final By fifthStarSpan = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div//span[5]");



    //obligatorios del pom

    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/Accordion/index.html";
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

    public Boolean areFirstSecondThirdFourthAndFifthStarsDisplayedOk() {
        waitForElementVisible(firstStarSpan);
        waitForElementVisible(secondStarSpan);
        waitForElementVisible(thirdStarSpan);
        waitForElementVisible(fourthStarSpan);
        waitForElementVisible(fifthStarSpan);

        return isDisplayed(firstStarSpan) && isDisplayed(secondStarSpan) && isDisplayed(thirdStarSpan) && isDisplayed(fourthStarSpan) && isDisplayed(fifthStarSpan);

    }

    public Boolean isTextVisibleFromFirstDivOk(String expectedText) {
        waitForElementVisible(firstText);
        boolean result;
        if(getText(firstText).equals(expectedText)){
            result = true;
        }
        else {
            result = false;
        }
        return result;
    }

    public String getTextFromSecondElement(){
        waitForElementVisible(secondText);
        return getText(secondText);
    }

}




