package activities.whenDo;

import controlAppiun.Button;
import controlAppiun.Item;
import controlAppiun.TextBox;
import org.openqa.selenium.By;

public class UpdateTaskScreen {
    public TextBox titleTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
    public TextBox descriptionTextBox = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
    public Button updateButton= new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

    public UpdateTaskScreen(){}
}
