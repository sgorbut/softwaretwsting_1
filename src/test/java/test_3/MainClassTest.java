package test.java.test_3;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainClassTest {

    @Test
    public void testGetClassString(){
        MainClass getStringFromMainClass = new MainClass();
        assertThat("Text, if something wrong",
            getStringFromMainClass.getClassString().toLowerCase(),
            containsString("hello"));
    }
}
