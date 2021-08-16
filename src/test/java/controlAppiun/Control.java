package controlAppiun;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import session.Session;

public class Control {

    protected WebElement control;
    protected By locator;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }

    public String getAttribute(String valor) throws MalformedURLException {
        try {
            this.findControl();
            return this.control.getAttribute(valor);
        } catch (
            Exception e
        )
        {
            return "No se encontro nada";
        }
    }

    public WebElement getControl() throws MalformedURLException {
        this.findControl();
        return control;
    }

    public boolean isVisible() throws MalformedURLException {
       try {
           this.findControl();
           return this.control.isDisplayed();
       } catch (
           Exception e
       )
       {
           return false;
       }
    }




}
