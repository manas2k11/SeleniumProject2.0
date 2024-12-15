package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test
    public void verifyLogin(){
        Assert.assertTrue(false);
        System.out.println("verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})
    public void verifyHomePage(){
        System.out.println("verify HomePage");
    }

    @Test
    public void verifyAccountCreation(){
        System.out.println("verify AccountCreation");
    }

}
