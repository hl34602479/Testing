package webDriverUniversity;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.ContactFormThankYouPage;
import pom.ContactUsPage;
import utils.BeforeAndAfterTestListener;

import static org.testng.Assert.assertEquals;

@Listeners({BeforeAndAfterTestListener.class})
public class ContactUsTests {
    private ContactUsPage contactUsPage;// Declarar
    private ContactFormThankYouPage contactFormThankYouPage;
    @BeforeClass( groups = { "Regression"})
    public void beforeClass() {
        contactUsPage = new ContactUsPage();// Instanciar
        contactFormThankYouPage = new ContactFormThankYouPage();
    }

    @Test(priority = 10, groups = { "Regression"})
    public void sendMessageOk() throws InterruptedException {
        // Arrange.
        String name = "Hernan";
        String lastname = "Lacarra";
        String email = "hernan_lacarra@hotmail.com";
        String comments = "Test";

        // Act.
        contactUsPage.load();
        contactUsPage.fillName(name);
        contactUsPage.fillLastname(lastname);
        contactUsPage.fillEmail(email);
        contactUsPage.fillComments(comments);
        contactUsPage.clickSubmmit();

        //Assert.
        assert contactFormThankYouPage.getContactReply().equals("Thank You for your Message!");


    }

    @Test(priority = 20, groups = { "Regression"})
    public void validateEmail() throws InterruptedException {

        //Arrange.
        String name = "Hernan";
        String lastname = "Lacarra";
        String email = "hernan_lacarrahotmail.com";
        String comments = "Test";

        //Act.
        contactUsPage.load();
        contactUsPage.fillName(name);
        contactUsPage.fillLastname(lastname);
        contactUsPage.fillEmail(email);
        contactUsPage.fillComments(comments);
        contactUsPage.clickSubmmit();

        //Assert.
        assert contactUsPage.getContactReplyError().equals("Error: Invalid email address");
    }

    @Test(priority = 30, groups = { "Regression"})
    public void validateEmptyForm() throws InterruptedException {

        //Arrange.
        String name = "";
        String lastname = "";
        String email = "";
        String comments = "";

        //Act.
        contactUsPage.load();
        contactUsPage.fillAndSubmitForm(name, lastname, email, comments);

        //Assert.
        assert contactUsPage.getContactReplyError().contains("Error: all fields are required");
        assert contactUsPage.getContactReplyError().contains("Error: Invalid email address");

    }

    @Test(priority = 40, groups = { "Regression"})
    public void validateResetButton() throws InterruptedException {
        //Arrange.
        String name = "Hernan";
        String lastname = "Lacarra";
        String email = "hernan_lacarra@hotmail.com";
        String comments = "Test.";

        //Act.
        contactUsPage.load();
        contactUsPage.fillName(name);
        contactUsPage.fillLastname(lastname);
        contactUsPage.fillEmail(email);
        contactUsPage.fillComments(comments);
        contactUsPage.clickReset();

        //Assert.
        assert contactUsPage.getNameValue().equals("");
        assert contactUsPage.getLasNameValue().equals("");
        assert contactUsPage.getEmailValue().equals("");
        assert contactUsPage.getCommentsValue().equals("");


        }
}

