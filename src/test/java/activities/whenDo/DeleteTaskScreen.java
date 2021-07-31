package activities.whenDo;

import controlAppiun.Button;
import controlAppiun.TextBox;
import org.openqa.selenium.By;

public class DeleteTaskScreen {

    public Button deleteButton= new Button(By.id("com.vrproductiveapps.whendo:id/deleteItem"));
    public Button confirmDeleteButton= new Button(By.id("android:id/button1"));


    public DeleteTaskScreen(){}
}
