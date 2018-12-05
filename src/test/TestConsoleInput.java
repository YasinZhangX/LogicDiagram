package test;

import static tools.Print.print;

import org.junit.Before;
import org.junit.Test;

import tools.ConsoleInput;

public class TestConsoleInput {
    ConsoleInput cIn = null;
    
    @Before
    public void testBefor() {
        cIn = new ConsoleInput(System.in);
    }

    @Test
    public void test() {
        Boolean ret;
        print("test yes");
        ret = cIn.getAnswer();
        print("result is " + ret);
        print("test no");
        ret = cIn.getAnswer();
        print("result is " + ret);
        print("test err");
        ret = cIn.getAnswer();
        print("result is " + ret);
        
    }

}
