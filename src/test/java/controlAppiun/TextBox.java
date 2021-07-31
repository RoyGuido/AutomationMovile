package controlAppiun;

import java.net.MalformedURLException;
import org.openqa.selenium.By;

public class TextBox extends Control{

    public TextBox(By locator) {
        super(locator);
    }
    public void SetValue(String value) throws MalformedURLException {
        this.findControl();
        this.control.clear();
        this.control.sendKeys(value);
    }

}
