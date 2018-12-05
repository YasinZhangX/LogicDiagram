package test;

import org.junit.Test;

import logic.Types;
import static tools.Print.*;

public class TestType {

    @Test
    public void test() {
        for (Types type : Types.values()) {
            print(type.toString());
        }
    }

}
