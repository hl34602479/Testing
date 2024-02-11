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
    final By secondAccordionText = By.xpath("//p[.='Cucumber (BDD) simplifies the requirement capturing process. Requirements can be captured, broken down and simplified effortlessly; making the captured requirements readable to anyone within the organisation and in turn providing the required details and backbone to develop accurate test cases also known as ‘Feature Files’.']");
    final By thirdAccordionText = By.xpath("//p[.='Automation testing has been steadily grown in popularity these past few years thanks to the time/ cost savings and efficiency that it offers. Companies throughout the world have or plan to use automation testing to rapidly speed up their test capabilities. Automation test engineers are in great demand and offer an average salary of £45,000+ (2018). Now is a great time to learn about automation test engineering and this course has been carefully developed to slowly introduce you from the basics, all the way to building advanced frameworks.']");
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