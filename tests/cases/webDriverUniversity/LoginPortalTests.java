package webDriverUniversity;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.LoginPortalPage;
import utils.BeforeAndAfterTestListener;
@Listeners({BeforeAndAfterTestListener.class})

public class LoginPortalTests {
    private LoginPortalPage loginPortalPage;// Declarar

    @BeforeClass(groups = {"Regression"})
    public void beforeClass() {
        loginPortalPage = new LoginPortalPage();// Instanciar
    }

    @Test(priority = 10, groups = {"Regression"})
    public void loginFailedPopUpOk() throws InterruptedException {
        // Arrange.
        String username = "Hernan";
        String password = "Lacarra";

        // Act.
        loginPortalPage.load();
        loginPortalPage.fillUsername(username);
        loginPortalPage.fillPassword(password);
        loginPortalPage.clickLogin();

        //Assert.
    }
}
