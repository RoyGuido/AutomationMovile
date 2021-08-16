package activities.alarma;

import controlAppiun.Button;
import controlAppiun.Item;
import controlAppiun.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button alarmButton = new Button(By.xpath("//rk[@content-desc=\"Alarm\"]"));
    public Button addAlarmButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Add alarm\"]"));
    public Item alarmItem = new Item(By.xpath("(//android.view.ViewGroup[@content-desc=\" Alarm\"])[3]"));
    public MainScreen(){}

}
