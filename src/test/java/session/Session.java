package session;

import controlAppiun.Label;
import factoryDevices.FactoryDevice;
import factoryDevices.FactoryDevice.DeviceType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.touch.TouchActions;

public class Session {
    // Tener un atributo del mismo tipo
    private static Session instance=null;
    private AppiumDriver driver;
    //Tener un constructor privado
    private Session() throws MalformedURLException {
        driver= FactoryDevice.make(DeviceType.ANDROID).create();
    }

    //Tener un Método estatico publico que retorne la instancia unica.
    // synchronized ---> No usar para evitar problemas de ejecución paralela.
    public static Session getInstance() throws MalformedURLException {
        if(instance == null)
            instance= new Session();
        return instance;
    }
    public void closeSession(){
        driver.quit();
        instance=null;
    }
    public void swipe() throws MalformedURLException {
        // Actions actions = new Actions(Session.getInstance().getDriver());

        Label startControl = new Label(By.xpath("//android.widget.ListView/android.view.ViewGroup[4]"));
        Label endControl = new Label(By.xpath("//android.widget.ListView/android.view.ViewGroup[1]"));
        int starControlx=startControl.getControl().getLocation().getX();
        int starControly=startControl.getControl().getLocation().getY();
        int endControlx=startControl.getControl().getLocation().getX();
        int endControly=startControl.getControl().getLocation().getY();
        TouchAction touchAction= new TouchAction(driver);
        touchAction.press(PointOption.point(starControlx,starControly)).
            waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
            moveTo(PointOption.point(endControlx,endControly)).
            release().perform();
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
