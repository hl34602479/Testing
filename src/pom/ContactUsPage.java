package pom;

import org.openqa.selenium.By;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class ContactUsPage extends BasePage implements DefaultPage {
    //selectores
    final By nameInput = By.xpath("//*[@name= 'first_name']");
    final By lastNameInput = By.xpath("//*[@name= 'last_name']");
    final By emailInput = By.xpath("//*[@name= 'email']");
    final By commentsInput = By.xpath("//*[@name= 'message']");
    final By submitButton = By.xpath("//*[@type= 'submit']");
    final By contactReply = By.xpath("//*[@id=\"contact_reply\"]/h1");
    final By getContactReplyErrorDiv = By.xpath("//body");
    final By resetButton = By.xpath("//*[@type= \"reset\"]");

    //obligatorios del pom
    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/Contact-Us/contactus.html";
    }

    @SafeVarargs
    public final <T> void load(T... values) {
        visit(getUrl(values));
    }

    //métodos
    public void fillName(String name) {
        sendKeys(name, nameInput);
    }

    public void fillLastname(String lastname) {
        sendKeys(lastname, lastNameInput);
    }

    public void fillEmail(String email) {
        sendKeys(email, emailInput);

    }

    public void fillComments(String text) {
        sendKeys(text, commentsInput);

    }

    public void clickSubmmit() {
        click(submitButton);
    }
    public String getContactReplyError(){
        return getText(getContactReplyErrorDiv);
    }

    public void fillAndSubmitForm( String name, String lastname, String email, String text){
        sendKeys( name, nameInput );
        sendKeys(lastname, lastNameInput);
        sendKeys(email, emailInput);
        sendKeys(text, commentsInput);
        click(submitButton);
    }

    public void clickReset() {
        click(resetButton);
    }

    public String getNameValue(){
        return getValue(nameInput);
    }

    public String getLasNameValue(){
        return getValue(lastNameInput);
    }

    public String getEmailValue(){
        return getValue(emailInput);
    }

    public String getCommentsValue() {
        return getValue(commentsInput);
    }

}