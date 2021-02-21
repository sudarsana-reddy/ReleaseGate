package releasegate.tests;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;


public class SampleTest {

    @Test
    public void passTest() {
        System.out.println("Pass Test");
        Assert.assertTrue(true);
    }

    @Test
    public void failTest() {
        System.out.println("Fail Test");
        Assert.assertTrue(false);
    }

    public static void main(String[] args){
        TestNG testng = new TestNG();
        testng.run();
    }

}

