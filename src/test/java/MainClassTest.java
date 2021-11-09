package test.java;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetLocalNumber(){
        MainClass getNumberFromMainClass = new MainClass();
        Assert.assertTrue("Text, if something wrong", getNumberFromMainClass.getLocalNumber() == 14);
    }
}
