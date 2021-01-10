import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Selenium
{

    @Test
    public void simpleTest1a()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");


        browser.findElement(By.id("user-message")).sendKeys("This is Denis");
        browser.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();

        WebElement href = browser.findElement(By.id("display"));

        assertEquals("This is Denis",href.getText());

        browser.close();
    }

    @Test
    public void simpleTest1b()
    {
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

        assertEquals("6",href1.getText());

        browser.close();
    }

    @Test
    public void simpleTest2a()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");


        browser.findElement(By.id("isAgeSelected")).click();

        WebElement href = browser.findElement(By.id("txtAge"));

        assertEquals("Success - Check box is checked",href.getText());
        browser.close();
    }

    @Test
    public void simpleTest2b()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        browser.findElement(By.id("check1")).click();

        WebElement href = browser.findElement(By.id("isChkd"));

        assertEquals("true",href.getAttribute("value"));

        browser.close();

    }

    @Test
    public void simpleTest3a()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");


        Select se = new Select(browser.findElement(By.xpath("//*[@id='select-demo']")));

        se.selectByValue("Monday");

       WebElement href = browser.findElement(By.className("selected-value"));

       assertEquals("Day selected :- Monday",href.getText());

       browser.close();

    }


    @Test
    public void simpleTest3b()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");


        Select se = new Select(browser.findElement(By.xpath("//*[@id='multi-select']")));

        se.selectByValue("New York");

        browser.findElement(By.id("printMe")).click();

        String elem= browser.findElement(By.xpath("//p[@class='getall-selected']")).getText();

        assertEquals("First selected option is : New York",elem);

        browser.close();
    }

    @Test
    public void simpleTest4()
    {
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

        assertEquals("Denis",name);
        assertEquals("Yevseyenko",surname);

        browser.close();
    }

    @Test
    public void simpleTest5()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        browser.findElement(By.id("title")).sendKeys("Denis");
        browser.findElement(By.id("description")).sendKeys("Hello,my name is Denis");

        browser.findElement(By.id("btn-submit")).click();

        WebElement href = browser.findElement(By.id("submit-control"));

        assertEquals("Ajax Request is Processing!",href.getText());

        browser.close();
    }

    @Test
    public void simpleTest6()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");

        browser.findElement(By.id("autoclosable-btn-success")).click();

        WebElement href = browser.findElement(By.id("autoclosable-btn-success"));

        assertTrue(href.isDisplayed());

        browser.findElement(By.id("normal-btn-success")).click();

        WebElement href1 = browser.findElement(By.className("alert alert-success alert-normal-success"));

        System.out.println(href1.getText());

        //browser.close();
    }

    @Test
    public void simpleTest7()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://datatables.net/examples/advanced_init/dt_events.html");

        List<WebElement> namesElements = browser.findElements(By.cssSelector("#example >tbody >tr >td:nth-child(1)"));

        List<String> names = new ArrayList<>();

        for(WebElement nameElement: namesElements)
        {
            names.add(nameElement.getText());
        }

        String nextButtonClass = browser.findElement(By.id("example_next")).getAttribute("class");

        while(!nextButtonClass.contains("disabled"))
        {
            browser.findElement(By.id("example_next")).click();
            namesElements = browser.findElements(By.cssSelector("#example >tbody >tr >td:nth-child(1)"));

            for(WebElement nameElement: namesElements)
            {
                names.add(nameElement.getText());
            }

            nextButtonClass = browser.findElement(By.id("example_next")).getAttribute("class");
        }

        for (String name: names)
        {
            System.out.println(name);
        }

        int totalNames = names.size();

        System.out.println("Total number of Name: " + totalNames);

        String displayCount = browser.findElement(By.id("example_info")).getText().split(" ")[5];

        System.out.println("Total number of displayed names count: " + displayCount);

        assertEquals(displayCount,String.valueOf(totalNames));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        browser.quit();



    }

    @Test
    public void simpleTest8()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("http://demo.automationtesting.in/Register.html");

        WebElement skillClick = browser.findElement(By.id("Skills"));
        skillClick.click();


        List<WebElement> skills = browser.findElements(By.cssSelector("#Skills >option"));

        for (WebElement skill :skills)
        {
            if(skill.getText().equals("Java"))
            {
                skill.click();
                assertEquals("Java",skill.getText());
                break;
            }
        }

        WebElement countyClick = browser.findElement(By.id("countries"));
        countyClick.click();

        List<WebElement> countries = browser.findElements(By.cssSelector("#countries >option"));

        for (WebElement country :countries)
        {
            if(country.getText().equals("Poland"))
            {
                country.click();
                assertEquals("Poland",country.getText());
                break;
            }
        }

        WebElement yearClick = browser.findElement(By.id("yearbox"));
        yearClick.click();

        List<WebElement> years = browser.findElements(By.cssSelector("#yearbox >option"));

        for (WebElement year :years)
        {
            if(year.getText().equals("2000"))
            {
                year.click();
                assertEquals("2000",year.getText());
                break;
            }
        }

        browser.close();
    }

    @Test
    public void simpleTest9()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("http://sportmanagers.ru/files/eng/engmain.php");

        WebElement username = browser.findElement(By.name("log"));

        username.clear();

        username.sendKeys("denned27");

        WebElement password = browser.findElement(By.name("pass"));

        password.clear();

        password.sendKeys("papamama27");

        WebElement loginButton = browser.findElement(By.name("go"));

        loginButton.click();

        browser.close();

    }

    @Test
    public void simpleTest10()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver.exe");

        WebDriver browser = new ChromeDriver();

        browser.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");

        List<WebElement> countries = browser.findElements(By.cssSelector("#country >option"));


        for(WebElement country: countries)
        {
            if(country.getText().equals("United States of America"))
            {
                country.click();
                assertEquals("United States of America",country.getText());
                break;
            }
        }

        List<WebElement> files = browser.findElements(By.cssSelector("#files >optgroup >option"));


        for (WebElement file: files)
        {
            if(file.getText().equals("Java"))
            {
                file.click();
                assertEquals("Java",file.getText());
                break;
            }
        }

        browser.close();


    }



}