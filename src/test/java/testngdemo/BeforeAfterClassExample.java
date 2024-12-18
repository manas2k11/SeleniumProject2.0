package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BeforeAfterClassExample {
    // before class //
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class once execute");
    }

    // declared globally //
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
    }

    @Test
    public void testDatePicker(){
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        
    }

    @Test
    public void testFacebook(){
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void prequisiteClose(){
        driver.close();
    }

    // after class //
    @AfterClass
    public void afterClass(){
        System.out.println("After class once execute");
    }
}
