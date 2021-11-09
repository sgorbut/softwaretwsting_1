package test.java.test_2;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    public int getResult(){
        MainClass getClassNumberFromMainClass = new MainClass();
        if (getClassNumberFromMainClass.getClassNumber() > 45) {
            System.out.println("> 45");
            return 0;
        } else
            System.out.println("< 45");
            return 1;
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertSame("Class_number < 45", 0, getResult());
    }
}
