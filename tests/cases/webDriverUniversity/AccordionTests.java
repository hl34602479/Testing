package webDriverUniversity;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.AccordionIndexPage;
import utils.BeforeAndAfterTestListener;
import static org.assertj.core.api.Assertions.assertThat;

@Listeners({BeforeAndAfterTestListener.class})

public class AccordionTests {
    private AccordionIndexPage accordionIndexPage;// Declarar

    @BeforeClass(groups = {"Regression"})
    public void beforeClass() {
        accordionIndexPage = new AccordionIndexPage();// Instanciar
    }

    @Test(priority = 10, groups = {"Regression"})
    public void displayedTextOnFirstAccordionOk() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        accordionIndexPage.clickOnFirstAccordionButton();
        Thread.sleep(1000);

        //Assert.
        assertThat(accordionIndexPage.getTextFromFirstAccordionButton()).isEqualTo("Manual testing has for some time been the most popular way to test code. For this method, the tester plays an important role of end user and verifies that all the features of the application work correctly. Manual testing however is on the decline. Companies and developers have realised the efficiency, accuracy and cost savings that is possible by adopting the use of automation testing.");
    }

    @Test(priority = 20, groups = {"Regression"})
    public void displayedTextOnSecondAccordionOk() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        accordionIndexPage.clickOnSecondAccordionButton();
        Thread.sleep(5000);

        //Assert.
        assertThat(accordionIndexPage.getTextFromSecondAccordionButton()).isEqualTo("Cucumber (BDD) simplifies the requirement capturing process. Requirements can be captured, broken down and simplified effortlessly; making the captured requirements readable to anyone within the organisation and in turn providing the required details and backbone to develop accurate test cases also known as ‘Feature Files’.");
    }

    @Test(priority = 30, groups = {"Regression"})
    public void displayedTextOnThirdAccordionOk() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        accordionIndexPage.clickOnThirdAccordionButton();
        Thread.sleep(5000);

        //Assert.
        assertThat(accordionIndexPage.getTextFromThirdAccordionButton()).isEqualTo("Automation testing has been steadily grown in popularity these past few years thanks to the time/ cost savings and efficiency that it offers. Companies throughout the world have or plan to use automation testing to rapidly speed up their test capabilities. Automation test engineers are in great demand and offer an average salary of £45,000+ (2018). Now is a great time to learn about automation test engineering and this course has been carefully developed to slowly introduce you from the basics, all the way to building advanced frameworks.");
    }

    @Test(priority = 40, groups = {"Regression"})
    public void displayedTextOnFourthAccordionOk() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        Thread.sleep(7000);
        accordionIndexPage.clickOnFourthAccordionButton();

        //Assert.
        assertThat(accordionIndexPage.getTextFromFourthAccordionButton()).isEqualTo("This text has appeared after 5 seconds!");
    }

    @Test(priority = 50, groups = {"Regression"})
    public void displayedTextOnHeaderAccordionIndexPageOk() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        Thread.sleep(1000);

        //Assert.
        assertThat(accordionIndexPage.getTextFromHeaderAccordionIndexPage()).isEqualTo("Click on One of the Accordian Items Below!");
    }

    @Test(priority = 60, groups = {"Regression"})
    public void displayedHiddenTextOk() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        Thread.sleep(7000);

        //Assert.
        assertThat(accordionIndexPage.getHiddenText()).isEqualTo("LOADING COMPLETE.");
    }

    @Test(priority = 70, groups = {"Regression"})// Falla porque no usa hide css para esconder.
    public void clickonfourthAccordionBeforeFiveSecondsOK() throws InterruptedException {
        //Arrange.

        //Act.
        accordionIndexPage.load();
        Thread.sleep(1000);
        accordionIndexPage.clickOnFourthAccordionButton();

        //Assert.
        assertThat(accordionIndexPage.isDisplayedTimeOutElement()).isFalse();
        //        assertThat(accordionIndexPage.isDisplayedTimeOutElement()).isEqualTo(false);
    }

}