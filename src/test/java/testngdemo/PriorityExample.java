package testngdemo;

import org.testng.annotations.Test;

public class PriorityExample {
    // ASCII values is considered here //
    // invocationCount=3 means 3 times method will run
    // invocationTimeOut means test will stop after 40 milliseconds //
    @Test(priority = 'c', invocationCount = 3,invocationTimeOut = 40)
    public void priZ(){
        System.out.println("priotity Z");
    }

    @Test()
    public void priY(){
        System.out.println("priotity Y");
    }

    @Test(priority = -2)
    public void priM(){
        System.out.println("priotity M");
    }

    @Test(priority = 2)
    public void priN(){
        System.out.println("priotity N");
    }
}
