package cleanTest;

import java.net.MalformedURLException;
import org.junit.jupiter.api.Test;
import session.Session;

public class ContactTest {

    @Test
    public void testSwipeEvent() throws  MalformedURLException {
        Session.getInstance().swipe();
        Session.getInstance().closeSession();
    }
}
