import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class SeleniumPageTest
{
    private static WebDriver browser;

    @BeforeAll
    static void setUp()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");
        browser = new ChromeDriver();
    }

    @AfterAll
    static void exitBrowser()
    {
        browser.close();
    }

    @Test
    void test()
    {

        SeleniumPage main = new SeleniumPage(browser);
        main.setInsertNum1();
        main.setInsertNum2();
        main.clickButton();
        assertEquals("6",main.readOutput().getText());
    }
}