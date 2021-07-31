package factoryDevices;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStack implements IDevice{

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "royguidosalazarh_4QvwF0");
        caps.setCapability("browserstack.key", "3TEWNvhFmTqURGhZ5MNf");

        // Set URL of the application under test
        caps.setCapability("app", "bs://3c99cd610007c0ec5f826aa7f51e7114f6072b12");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy S21 Ultra");
        caps.setCapability("os_version", "11.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "UCB Diplomado Testing");
        caps.setCapability("build", "Modulo 3");
        caps.setCapability("name", "WhenDo");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
            new URL("http://hub.browserstack.com/wd/hub"), caps);


        /* Write your Custom code here */


        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        return driver;


    }
}
