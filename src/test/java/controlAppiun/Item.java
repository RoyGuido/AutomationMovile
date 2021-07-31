package controlAppiun;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

public class Item extends Control{
    public Item(By locator) {
        super(locator);
    }
    public boolean IsDisplay() throws MalformedURLException {
        this.findControl();
        if( this.control != null){
            return true;
        }else{
            return false;
        }
    }

}
