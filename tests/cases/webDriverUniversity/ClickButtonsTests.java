package webDriverUniversity;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.ClickButtonsPage;
import utils.BeforeAndAfterTestListener;

@Listeners({BeforeAndAfterTestListener.class})

public class ClickButtonsTests {
    private ClickButtonsPage clickButtonsPage;// Declarar

    @BeforeClass(groups = {"Regression"})
    public void beforeClass() {
        clickButtonsPage = new ClickButtonsPage();// Instanciar
    }

    @Test(priority = 10, groups = {"Regression"})
    public void getTextFromPopUp() throws InterruptedException {
        //Act.
        clickButtonsPage.load();
        clickButtonsPage.clickMeButtonA();
        //Assert.
        assert clickButtonsPage.isModalADisplayed();

    }

    @Test(priority = 20, groups = {"Regression"})
    public void getTextFromPopUpJavascript() throws InterruptedException {
        //Act.
        clickButtonsPage.load();
        clickButtonsPage.clickMeButtonB();
        //Assert.
        assert clickButtonsPage.isModalJsADisplayed();
    }

    @Test(priority = 30, groups = {"Regression"})
    public void getTextFromPopUpActionMove() throws InterruptedException {
        //Act.
        clickButtonsPage.load();
        clickButtonsPage.clickMeButtonC();
        //Assert.
        assert clickButtonsPage.isLastModalDiplayed();

    }

}
