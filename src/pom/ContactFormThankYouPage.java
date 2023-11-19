package pom;

import helpers.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.GetElementText;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class ContactFormThankYouPage extends ContactUsPage implements DefaultPage {

    //Selectores.
    final By contactReply = By.xpath("//*[@id=\"contact_reply\"]/h1");

    //obligatorios del pom.


    //Metodos.
    public String getContactReply(){
        return getText(contactReply);
    }
 }
