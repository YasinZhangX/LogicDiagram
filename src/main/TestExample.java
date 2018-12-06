package main;

import java.util.ArrayList;

import logic.LogicDiagram;
import logic.Questions;
import logic.TreeNode;
import logic.Types;
import tools.ConsoleInput;
import tools.Print;

/**
 * @author Yasin Zhang
 * @version 1.0
 */
public class TestExample {
    public static void main(String[] args) {
        ArrayList<TreeNode> question_list = new ArrayList<>();
        
        for (Questions q : Questions.values()) {
            TreeNode treeNode = new TreeNode(q);
            question_list.add(treeNode);
        }
        
        ConsoleInput cIn = new ConsoleInput(System.in);
        LogicDiagram ld = new LogicDiagram(question_list);
        Types type = ld.judgment(cIn);
        Print.print(type);
    }
}
