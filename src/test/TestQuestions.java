package test;

import org.junit.Test;

import logic.Questions;
import static tools.Print.*;

public class TestQuestions {

    @Test
    public void test() {
        for (Questions q : Questions.values()) {
            print(q.getquestion());
        }
    }

}
