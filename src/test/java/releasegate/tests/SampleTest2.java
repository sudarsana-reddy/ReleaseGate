package releasegate.tests;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;


public class SampleTest2 {

    @Test
    public void passTest() {
        System.out.println("Pass Test");
        Assert.assertTrue(true);
    }

}

