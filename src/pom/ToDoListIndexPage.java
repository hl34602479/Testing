package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pom.base.BasePage;
import pom.base.DefaultPage;

public class ToDoListIndexPage extends BasePage implements DefaultPage {
    //Selectores.
    final By toDoListInput = By.xpath("//*[@id=\"container\"]/input");
    final By plusButton = By.id("plus-icon");
    final By listItemByText(String itemText){
        return By.xpath("//ul/li[contains(text(),'" + itemText + "')]");
    }
    final By lastDeleteButton = By.xpath("//ul/li[last()]/span");
    final By lastTaskButton = By.xpath("//ul/li[last()]");

    //obligatorios del pom

    @SafeVarargs
    @Override
    public final <T> String getUrl(T... values) {
        return "https://www.webdriveruniversity.com/To-Do-List/index.html";
    }

    @SafeVarargs
    public final <T> void load(T... values) {
        visit(getUrl(values));
    }

    //Métodos.
    public void addButton() {
        click(plusButton);
    }

    public void addANewTask(String newTask) {
        sendKeys(newTask, toDoListInput);
        sendKeys(Keys.ENTER.toString(),toDoListInput);
    }

    public boolean isNewItemVisible(String textToFind){
        return isDisplayed(listItemByText(textToFind));
    }

    public void clickOnDeleteButton() {
        click(lastDeleteButton);
    }

    public boolean isNotVisibleLastTask(String textToFind){
        return !isDisplayed(listItemByText(textToFind));
    }

    public void clickOnLastTask (){
        click(lastTaskButton);
    }

    public boolean isLastTaskCompleted (){
        return elementHasClass(lastTaskButton, "completed");
    }

}
