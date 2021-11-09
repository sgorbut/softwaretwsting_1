package test.java.test_1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber(){
        MainClass getNumberFromMainClass = new MainClass();
        Assert.assertTrue("Text, if something wrong", getNumberFromMainClass.getLocalNumber() == 14);
    }
}
