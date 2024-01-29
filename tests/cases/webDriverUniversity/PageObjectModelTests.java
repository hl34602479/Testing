package webDriverUniversity;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.PageObjectModelIndexPage;
import utils.BeforeAndAfterTestListener;
@Listeners({BeforeAndAfterTestListener.class})

public class PageObjectModelTests {
    private PageObjectModelIndexPage pageObjectModelIndexPage;// Declarar

    @BeforeClass(groups = {"Regression"})
    public void beforeClass() {
        pageObjectModelIndexPage = new PageObjectModelIndexPage();// Instanciar
    }

    @Test(priority = 10, groups = {"Regression"})
    public void isLeftSpanDisplayedOk() throws InterruptedException {
        //Arrange.

        //Act.
        pageObjectModelIndexPage.load();
        Thread.sleep(5000);

        //Assert.
        assert pageObjectModelIndexPage.isLeftSpanDisplayed();
    }

    @Test(priority = 20, groups = {"Regression"})
    public void isRightSpanDisplayedOk() throws InterruptedException {
        //Arrange.

        //Act.
        pageObjectModelIndexPage.load();
        Thread.sleep(5000);

        //Assert.
        assert pageObjectModelIndexPage.isRightSpanDisplayed();
    }

    @Test(priority = 30, groups = {"Regression"})
    public void areRightAndLeftSpanDisplayedOk() throws InterruptedException {
        //Arrange.

        //Act.
        pageObjectModelIndexPage.load();
        Thread.sleep(5000);

        //Assert.
        assert pageObjectModelIndexPage.areLeftAndRightDisplayed();
    }

    @Test(priority = 40, groups = {"Regression"})
    public void areFirstSecondAndThirdLiDisplayedOk() throws InterruptedException {
        //Arrange.

        //Act.
        pageObjectModelIndexPage.load();
        Thread.sleep(5000);

        //Assert.
        assert pageObjectModelIndexPage.areFirstSecondAndThirdLiDisplayedOk();

    }

    @Test(priority = 50, groups = {"Regression"})
    public void areFirstSecondThirdAndFourthDivDisplayedOk() throws InterruptedException {
        //Arrange.

        //Act.
        pageObjectModelIndexPage.load();
        Thread.sleep(5000);

        //Assert.
        assert pageObjectModelIndexPage.areFirstSecondThirdFourthDivDisplayedOk();
    }

    @Test(priority = 50, groups = {"Regression"})
    public void isTextVisibleFromFirstDivOk() throws InterruptedException {
        //Arrange.

        //Act.
        pageObjectModelIndexPage.load();
        Thread.sleep(5000);

        //Assert.
        //assert pageObjectModelIndexPage.isTextVisible(WebElement firstText);


    }
}
