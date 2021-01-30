import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage
{
    private static String PAGE_URL1 = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";

    private WebDriver browser;

    public SeleniumPage(WebDriver browser)
    {
        this.browser = browser;
        browser.get(PAGE_URL1);
        PageFactory.initElements(browser,this);
    }

    @FindBy(id="user-message")
    WebElement inputName;

    @FindBy(xpath="//button[contains(text(),'Get Total')]")
    WebElement button;

    @FindBy(id="displayvalue")
    WebElement output;

    @FindBy(id="sum1")
    WebElement insertNum1;

    @FindBy(id="sum2")
    WebElement insertNum2;

    public void insertName()
    {
        inputName.sendKeys("Hello Denis");
    }

    public void clickButton()
    {
        button.click();
    }

    public WebElement readOutput()
    {
        return this.output;
    }

    public void setInsertNum1()
    {
        insertNum1.sendKeys("1");
    }

    public void setInsertNum2()
    {
        insertNum2.sendKeys("5");
    }
}
