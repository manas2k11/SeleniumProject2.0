package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgExample {
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
        System.out.println("Test closed");
        driver.close();
    }


}
