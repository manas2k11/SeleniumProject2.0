package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups = "smoke")
    public void verifyPayments(){
        Assert.assertTrue(false);
        System.out.println("verify Payments");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyReports(){
        System.out.println("verify Reports");
    }

    @Test
    public void verifyTasks(){
        System.out.println("verify Tasks");
    }

}
