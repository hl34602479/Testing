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
        public void loginFailedPopUpOk() throws InterruptedException {
        //Act.
            clickButtonsPage.load();
            clickButtonsPage.clickMeButtonA();
        }

}
