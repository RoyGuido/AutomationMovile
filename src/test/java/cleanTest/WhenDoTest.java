package cleanTest;

import activities.whenDo.CreateTaskScreen;
import activities.whenDo.DeleteTaskScreen;
import activities.whenDo.MainScreen;
import activities.whenDo.UpdateTaskScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

import java.net.MalformedURLException;

public class WhenDoTest {

    private MainScreen mainScreen= new MainScreen();
    private CreateTaskScreen createTaskScreen= new CreateTaskScreen();
    private UpdateTaskScreen updateTaskScreen = new UpdateTaskScreen();
    private DeleteTaskScreen deleteTaskScreen = new DeleteTaskScreen();

    @Test
    public void verifyCreateTask() throws MalformedURLException {
        String title="CLEAN";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.SetValue(title);
        createTaskScreen.descriptionTextBox.SetValue("this is a description");
        createTaskScreen.saveButton.click();

        Assertions.assertEquals(title,mainScreen.nameTaskLabel.getText(),"ERROR! task was not created");
    }
    @Test
    public void verifyUpdateTask() throws MalformedURLException {
        String title="CLEAN";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.SetValue(title);
        createTaskScreen.descriptionTextBox.SetValue("this is a description");
        createTaskScreen.saveButton.click();
        Assertions.assertEquals(title,mainScreen.nameTaskLabel.getText(),"ERROR! task was not created");
        String titleU="CLEAN UPDATE";
        mainScreen.taskItem.click();
        updateTaskScreen.titleTextBox.SetValue(titleU);
        updateTaskScreen.descriptionTextBox.SetValue("this is a description update");
        updateTaskScreen.updateButton.click();
        Assertions.assertEquals(titleU,mainScreen.nameTaskLabel.getText(),"ERROR! task was not created");
    }
    @Test
    public void verifyDeleteTask() throws MalformedURLException, InterruptedException {
        String title="CLEAN";
        mainScreen.addTaskButton.click();
        createTaskScreen.titleTextBox.SetValue(title);
        createTaskScreen.descriptionTextBox.SetValue("this is a description");
        createTaskScreen.saveButton.click();
        Assertions.assertEquals(title,mainScreen.nameTaskLabel.getText(),"ERROR! task was not created");
        String titleU="CLEAN UPDATE";
        mainScreen.taskItem.click();
        updateTaskScreen.titleTextBox.SetValue(titleU);
        updateTaskScreen.descriptionTextBox.SetValue("this is a description update");
        updateTaskScreen.updateButton.click();
        Assertions.assertEquals(titleU,mainScreen.nameTaskLabel.getText(),"ERROR! task was not created");
        mainScreen.taskItem.click();
        deleteTaskScreen.deleteButton.click();
        deleteTaskScreen.confirmDeleteButton.click();
        Assertions.assertEquals(false, mainScreen.taskItem.isVisible());
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
