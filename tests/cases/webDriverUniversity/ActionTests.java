package webDriverUniversity;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.base.ActionIndexPage;
import utils.BeforeAndAfterTestListener;
import static org.assertj.core.api.Assertions.assertThat;

@Listeners({BeforeAndAfterTestListener.class})

public class ActionTests {

    private ActionIndexPage actionIndexPage;// Declarar

    @BeforeClass(groups = {"Regression"})
    public void beforeClass() {
        actionIndexPage = new ActionIndexPage();// Instanciar
    }

    @Test(priority = 10, groups = {"Regression"})
    public void displayedTextOnFirstAccordionOk() throws InterruptedException {
        //Arrange.

        //Act.
        actionIndexPage.load();
        Thread.sleep(2000);

        //Assert.
        assertThat(actionIndexPage.getTextFromDoubleClickBox()).isEqualTo("Double Click Me!");
    }

    @Test(priority = 20, groups = {"Regression"})
    public void clickOnBoxAndSeeDontReleaseMeOk() throws InterruptedException {
        //Arrange.

        //Act.
        actionIndexPage.load();
        Thread.sleep(1000);
        actionIndexPage.clickOnBox();
        Thread.sleep(2000);

        //Assert.
        assertThat(actionIndexPage.getTextFromClickBox()).isEqualTo("Dont release me!!!");

    }

}