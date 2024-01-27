package webDriverUniversity;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.ToDoListIndexPage;
import utils.BeforeAndAfterTestListener;
@Listeners({BeforeAndAfterTestListener.class})

public class ToDoListTests {
    private ToDoListIndexPage toDoListIndexPage;// Declarar
    @BeforeClass(groups = {"Regression"})
    public void beforeClass() {
        toDoListIndexPage = new ToDoListIndexPage();// Instanciar
    }

    @Test(priority = 10, groups = {"Regression"})
    public void addNewListOk() throws InterruptedException {
        // Arrange.
        String newTask = "field 1";

        // Act.
        toDoListIndexPage.load();
        toDoListIndexPage.addANewTask(newTask);
        Thread.sleep(5000);
        //Assert.
        assert toDoListIndexPage.isNewItemVisible(newTask);
    }

    @Test(priority = 20, groups = {"Regression"})
    public void deleteAnewTaskOk() throws InterruptedException {
        //Arrange.
        String newTask = "Field 1";

        //Act.
        toDoListIndexPage.load();
        toDoListIndexPage.addANewTask(newTask);
        Thread.sleep(5000);
        toDoListIndexPage.clickOnDeleteButton();
        Thread.sleep(1000);

        //Assert.
        assert toDoListIndexPage.isNotVisibleLastTask(newTask);

    }

    @Test(priority = 30, groups = {"Regression"})
    public void notCreateATaskEmptyOk() throws  InterruptedException{
        //Arrange.
        String newTask = "     ";

        //Act.
        toDoListIndexPage.load();
        toDoListIndexPage.addANewTask(newTask);
        Thread.sleep(5000);

        //Assert.
        assert toDoListIndexPage.isNotVisibleLastTask(newTask);
    }

    @Test(priority = 40, groups = {"Regression"})
    public void checkListLastTaskCreatedOk() throws InterruptedException{
        //Arrange.
        String newTask = "Field 1";

        //Act.
        toDoListIndexPage.load();
        toDoListIndexPage.addANewTask(newTask);
        Thread.sleep(5000);
        toDoListIndexPage.clickOnLastTask();
        Thread.sleep(1000);

        //Assert.
        assert toDoListIndexPage.isLastTaskCompleted();



    }
}
