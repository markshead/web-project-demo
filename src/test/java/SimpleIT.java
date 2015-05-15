import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by markshead on 4/30/15.
 */
public class SimpleIT extends TestCase {
    public static void testPage() {
        WebDriver webDriver = new FirefoxDriver();
        webDriver.get("http://localhost:8080");
        String title = webDriver.getTitle();
        assertEquals("Hello World!", title);
    }

}
