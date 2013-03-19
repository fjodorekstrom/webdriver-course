package hackernews;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: fjodorekstrom
 * Date: 3/19/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class HackerNewsTitleTests {
    @Test
    public void hackerNewsTitleIsCorrect() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://news.ycombinator.com/");
        assertEquals("Hacker News", driver.getTitle());
        driver.quit();
    }
}
