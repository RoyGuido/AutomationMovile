package activities.alarma;

import controlAppiun.Button;
import controlAppiun.Item;
import org.openqa.selenium.By;

public class CreateAlarmScreen {
    public Item timeItem = new Item(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"11\"]"));
    public Item minuteItem = new Item(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"35\"]"));
    public Button saveButton= new Button(By.id("android:id/button1"));
}
