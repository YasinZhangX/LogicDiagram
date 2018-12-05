package main;

import java.util.ArrayList;

import logic.Questions;
import logic.TreeNode;

public class TestExample {
    public static void main(String[] args) {
        ArrayList<TreeNode> question_list = new ArrayList<>();
        
        for (Questions q : Questions.values()) {
            TreeNode treeNode = new TreeNode(q);
            question_list.add(treeNode);
        }
        
        
    }
}
