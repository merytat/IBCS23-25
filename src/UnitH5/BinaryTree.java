package UnitH5;

import java.util.ArrayList;

public class BinaryTree {
    private ArrayList<TreeNode> tree;
    private TreeNode root;

    public ArrayList<TreeNode> getTree(){
        return tree;
    }

    public BinaryTree() {
        this.tree = new ArrayList<TreeNode>();
    }

    public String addNode1(int data) {
        if (root == null) {
            root = new TreeNode(data);
            return "added";
        } else {
            System.out.println("error");
            return addNodeRecursive(root, data);
        }
    }

    private String addNodeRecursive(TreeNode current, int data) {
        if (data < current.getData()) {
            if (current.getLeftChild() == null) {
                TreeNode newNode = new TreeNode(data, current);
                current.setLeftChild(newNode);
                return "DONE";
            } else {
                return addNodeRecursive(current.getLeftChild(), data);
            }
        } else {
            if (current.getRightChild() == null) {
                TreeNode newNode = new TreeNode(data, current);
                current.setRightChild(newNode);
                return "DONE";
            } else {
                return addNodeRecursive(current.getRightChild(), data);
            }
        }

    }

    //return status of node added
    //"Node 'Data' added as root"
    //"Node 'Data' added as left/right child of Node 'Parent'
    public String addNode(int data) {
        int index = 0;
        while (true) {
            if (tree.size()==0 && tree.get(index) == null) {
                TreeNode tn = new TreeNode(data);
                return "Node "+ data + "added as root";
            } else {
                if (tree.get(index).getData() < data) { //am I a right child?
                    if (tree.get(index).getRightChild() == null) {
                        TreeNode tn = new TreeNode(data, tree.get(index));
                        return "Node" + data + "added as right child of Node " + tree.get(index).getData();
                    } else {
                        index = tree.get(index).getRightChild().getIndex();
                    }

                } else {
                    //I am the left child
                    if (tree.get(index).getLeftChild() == null) {
                        TreeNode tn = new TreeNode(data, tree.get(index));
                        return "Node" + data + "added as left child of Node " + tree.get(index).getData();
                    } else {
                        index = tree.get(index).getLeftChild().getIndex();
                    }
                }
            }
        }
    }

    //return a String representing the data of
    // node visited following a in-order traversal
    public String inorderTraversal() {
        return "";
    }

    //return a String representing the data of
    // node visited following a pre-order traversal
    public String preorderTraversal() {
        return "";
    }

    //return a String representing the data of
    // node visited following a post-order traversal
    public String postorderTraversal() {
        return "";

    }
}

class TreeTester{

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.println(bt.getTree()); // empty tree
        bt.addNode1(19);
        System.out.println(bt.getTree());
        bt.addNode1(9);
        bt.addNode1(5);
        System.out.println(bt.getTree());
    }
}
