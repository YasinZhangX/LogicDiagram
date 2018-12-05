package test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import logic.LogicDiagram;
import logic.Questions;
import logic.TreeNode;
import logic.Types;
import tools.ConsoleInput;
import tools.Print;

public class TestLogicDiagram {
    ConsoleInput cIn = null;
    ArrayList<TreeNode> question_list = new ArrayList<>();
    ArrayList<TreeNode> result_list = new ArrayList<>();
    
    @Before
    public void beforeTest() {
        cIn = new ConsoleInput(System.in);
        for (Questions q : Questions.values()) {
            TreeNode treeNode = new TreeNode(q);
            question_list.add(treeNode);
        }
        
        for (Types t : Types.values()) {
            TreeNode treeNode = new TreeNode(t);
            result_list.add(treeNode);
        }
    }

    @Test
    public void test() {
        LogicDiagram ld = new LogicDiagram(question_list);
        Types type = ld.judgment(cIn);
        Print.print(type);
    }

}
