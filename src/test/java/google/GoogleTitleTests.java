package google;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: fjodorekstrom
 * Date: 3/19/13
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class GoogleTitleTests {
    @Test
    public void googleTitleIsCorrect() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com/");
        assertEquals("Google", driver.getTitle());
        driver.quit();
    }
}
