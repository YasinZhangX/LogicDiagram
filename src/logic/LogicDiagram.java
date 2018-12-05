package logic;

import java.util.List;

import tools.Input;

import static tools.Print.*;

public class LogicDiagram {
    TreeNode root = new TreeNode("Start");
    
    public LogicDiagram(List<TreeNode> qList) {
        root.setlChild(qList.get(0));
        qList.get(0).setParent(root);
        for (int i = 0; i < qList.size(); i++) {
            TreeNode node = qList.get(i);
            setBranch(node, qList);
        }
    }
    
    private void setBranch(TreeNode node, List<TreeNode> qList) {
        Questions qId = (Questions) node.getData();
        
        if (qId.getlBranch() instanceof Types) {
            node.setlChild(new TreeNode(qId.getlBranch()));
        } else {
            int index = (Integer) qId.getlBranch() - 1;
            node.setlChild(qList.get(index));
            qList.get(index).setParent(node);
        }
        
        if (qId.getrBranch() instanceof Types) {
            node.setrChild(new TreeNode(qId.getrBranch()));
        } else {
            int index = (Integer) qId.getrBranch() - 1;
            node.setrChild(qList.get(index));
            qList.get(index).setParent(node);
        }  
    }

    public Types judgment(Input in) {
        Types type = null;
        
        print(root.getData());
        TreeNode node = root.getlChild();
        
        if (node.getData() instanceof Types) {
            return (Types) node.getData();
        }
        
        print(node.getData());
        if (in.getAnswer()) {
            node = node.getlChild();
            judgment(in);
        }
        return type;
    }
}
