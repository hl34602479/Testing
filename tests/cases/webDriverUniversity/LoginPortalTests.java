package webDriverUniversity;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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
        assert loginPortalPage.getAlertText().equals("validation failed");
    }

    @Test(priority = 20, groups = {"Regression"})
    public void loginOkPopUpOk() throws InterruptedException {
        // Arrange.
        String username = "webdriver";
        String password = "webdriver123";

        // Act.
        loginPortalPage.load();
        loginPortalPage.fillUsername(username);
        loginPortalPage.fillPassword(password);
        loginPortalPage.clickLogin();

        //Assert.
        assert loginPortalPage.getAlertText().equals("validation succeeded");
    }

    @Test(priority = 30, groups = {"Regression"})
    public void loginFailedEmptyForm() throws InterruptedException {
        // Arrange.
        String username = "";
        String password = "";

        // Act.
        loginPortalPage.load();
        loginPortalPage.fillUsername(username);
        loginPortalPage.fillPassword(password);
        loginPortalPage.clickLogin();

        //Assert.
        assert loginPortalPage.getAlertText().equals("validation failed");
    }
    // Son los mismos Test de arriba pero usando un test de data provider.
    @DataProvider(name = "credentials")
    public static Object[][] credentialsData() {
        return new Object[][] {
                {"Hernan", "Lacarra", "validation failed"},
                {"webdriver", "webdriver123", "validation succeeded"},
                {"", "", "validation failed"}
        };
    }

    @Test(priority = 40, groups = {"Regression"}, dataProvider = "credentials")
    public void testLoginScenarios(String first, String second, String message) throws InterruptedException {
        // Arrange.
        String username = first;
        String password = second;

        // Act.
        loginPortalPage.load();
        loginPortalPage.fillUsername(username);
        loginPortalPage.fillPassword(password);
        loginPortalPage.clickLogin();

        //Assert.
        assert loginPortalPage.getAlertText().equals(message);
    }

}
