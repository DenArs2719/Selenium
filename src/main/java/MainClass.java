import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

public class MainClass
{
    public static void main(String[] args)
    {
        /*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");


        browser.findElement(By.id("user-message")).sendKeys("This is Denis");

        browser.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();

        WebElement href = browser.findElement(By.id("display"));


        browser.findElement(By.id("sum1")).sendKeys("1");
        browser.findElement(By.id("sum2")).sendKeys("5");

        browser.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();

        WebElement href1 = browser.findElement(By.id("displayvalue"));

        System.out.println(href1.getText());
         */

        /*System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");


        browser.findElement(By.id("isAgeSelected")).click();

        WebElement href = browser.findElement(By.id("txtAge"));

        System.out.println(href.getText());

         */

       /* System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");



        browser.findElement(By.id("cb1-element")).click();


        browser.findElement(By.id("check1")).click();

        WebElement href = browser.findElement(By.id("check1"));

        System.out.println(href.getText());

        */

        /*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");


        Select se = new Select(browser.findElement(By.xpath("//*[@id='multi-select']")));

        se.selectByValue("New York");

        browser.findElement(By.id("printMe")).click();

        String elem= browser.findElement(By.xpath("//p[@class='getall-selected']")).getText();

        System.out.println(elem);


         */

        /*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/input-form-demo.html");


        browser.findElement(By.name("first_name")).sendKeys("Denis");
        browser.findElement(By.name("last_name")).sendKeys("Yevseyenko");

        WebElement href =  browser.findElement(By.className("form-control"));

        WebElement web = browser.findElement(By.name("first_name"));

        String name = web.getAttribute("value");
        System.out.println(name);
        web = browser.findElement(By.name("last_name"));
        String surname = web.getAttribute("value");

        System.out.println(surname);

         */

        /*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        browser.findElement(By.id("title")).sendKeys("Denis");
        browser.findElement(By.id("description")).sendKeys("Hello,my name is Denis");

        browser.findElement(By.id("btn-submit")).click();

        WebElement href = browser.findElement(By.id("submit-control"));

        System.out.println(href.getText());


        browser.close();

         */

    }
}
