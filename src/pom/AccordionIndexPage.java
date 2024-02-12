package pom;

import org.openqa.selenium.By;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class AccordionIndexPage  extends BasePage implements DefaultPage {
    //Selectores.
    final By firstAccordionButton = By.xpath("//button[@id='manual-testing-accordion']");
    final By secondAccordionButton = By.xpath("//button[@id='cucumber-accordion']");
    final By thirdAccordionButton = By.xpath("//button[@id='automation-accordion']");
    final By fourthAccordionButton = By.xpath("//button[@id='click-accordion']");
    final By firstAccordionText = By.xpath("//button[@id='manual-testing-accordion']/following-sibling::div[@id='manual-testing-description']/p");
    final By secondAccordionText = By.xpath("//button[@id='cucumber-accordion']/following-sibling::div[@id='cucumber-testing-description']/p");
    final By thirdAccordionText = By.xpath("//button[@id='automation-accordion']/following-sibling::div[@id='automation-testing-description']/p");
    final By fourthAccordionText = By.xpath("//div[.='This text has appeared after 5 seconds!']");
    final By headerAccordionText = By.xpath("//h1");
    final By hiddenText = By.xpath("//p[.='LOADING COMPLETE.']");


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
    public void clickOnFirstAccordionButton(){
        waitForElementVisible(firstAccordionButton);
        click(firstAccordionButton);
    }

    public String getTextFromFirstAccordionButton(){
        waitForElementVisible(firstAccordionText);
        return getText(firstAccordionText);
    }

    public void clickOnSecondAccordionButton(){
        waitForElementVisible(secondAccordionButton);
        click(secondAccordionButton);
    }

    public String getTextFromSecondAccordionButton(){
        waitForElementVisible(secondAccordionText);
        return getText(secondAccordionText);
    }

    public void clickOnThirdAccordionButton() {
        waitForElementVisible(thirdAccordionButton);
        click(thirdAccordionButton);
    }

    public String getTextFromThirdAccordionButton(){
        waitForElementVisible(thirdAccordionText);
        return getText(thirdAccordionText);
    }

    public void clickOnFourthAccordionButton() {
        waitForElementVisible(fourthAccordionButton);
        click(fourthAccordionButton);
    }

    public String getTextFromFourthAccordionButton(){
        waitForElementVisible(fourthAccordionText);
        return getText(fourthAccordionText);
    }

    public String getTextFromHeaderAccordionIndexPage(){
        waitForElementVisible(headerAccordionText);
        return getText(headerAccordionText);
    }

    public String getHiddenText(){
        waitForElementVisible(hiddenText);
        return getText(hiddenText);
    }

    public Boolean isDisplayedTimeOutElement() {
        waitForElementVisible(fourthAccordionText);
        return isDisplayed(fourthAccordionText);
    }

}