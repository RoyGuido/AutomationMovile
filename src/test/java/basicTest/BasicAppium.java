package basicTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BasicAppium {
    private AppiumDriver drive;

    @BeforeEach
    public void setup() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Emulador");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity",".ui.HomeActivity");
        capabilities.setCapability("platformName","Android");
        drive = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        //implicit wait
        drive.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterEach
    public void cleanup() throws InterruptedException {
        Thread.sleep(5000);
        drive.quit();
    }
    @Test
    public void createTaskWhenDo(){
        // Click +
        drive.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        // Set Title
        drive.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("REMOVE");
        // Set Notas
        drive.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("esta es una descripcion");
        // Click Save
        drive.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
        // Verificacion
        String expectedResult="REMOVE";
        String actualResult=drive.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR tarea no fue creado!");
        }

}
