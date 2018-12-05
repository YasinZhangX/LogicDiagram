package main;

import logic.Types;
import tools.ConsoleInput;
import static tools.Print.*;

public class TestExample {
    public static void main(String[] args) {
        Boolean ret;
        ConsoleInput cIn = new ConsoleInput(System.in);
        print("test yse");
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
