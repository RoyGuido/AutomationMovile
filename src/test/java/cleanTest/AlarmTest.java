package cleanTest;


import activities.alarma.CreateAlarmScreen;
import activities.alarma.MainScreen;
import java.net.MalformedURLException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import session.Session;

public class AlarmTest {

    private MainScreen mainScreen= new MainScreen();
    private CreateAlarmScreen createAlarmScreen= new CreateAlarmScreen();


    @Test
    public void verifyCreateAlarm() throws MalformedURLException {

        mainScreen.alarmButton.click();
        mainScreen.addAlarmButton.click();
        createAlarmScreen.timeItem.click();
        createAlarmScreen.minuteItem.click();
        createAlarmScreen.saveButton.click();
        Assertions.assertEquals(true, mainScreen.alarmItem.isVisible());
    }

    @AfterEach
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
