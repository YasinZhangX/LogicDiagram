package logic;

/**
 * @author Yasin Zhang
 * @version 1.0
 */
public class TreeNode {
    private Object mData;
    private TreeNode mParent;
    private TreeNode lChild;
    private TreeNode rChild;
    
    
    public TreeNode(Object data, TreeNode parent, TreeNode left, TreeNode right) {
        mData = data;
        mParent = parent;
        lChild = left;
        rChild = right;
    }
    
    public TreeNode(Object data) {
        mData = data;
        mParent = null;
        lChild = null;
        rChild = null;
    }
    
    public Object getData() {
        return mData;
    }
    
    public void setData(Object data) {
        mData = data;
    }
    
    public TreeNode getParent() {
        return mParent;
    }
    
    public void setParent(TreeNode parent) {
        mParent = parent;
    }
    
    public void setlChild(TreeNode left) {
        lChild = left;
    }
    
    public TreeNode getlChild() {
        return lChild;
    }
    
    public void setrChild(TreeNode right) {
        rChild = right;
    }
    
    public TreeNode getrChild() {
        return rChild;
    }
}
