package UnitH5;

public class TreeNode {
    private int data;
    private TreeNode parent;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private int index;
    private static int counter = 0;

    public TreeNode(int data) {
        this.data = data;
        this.counter = counter + 1;
        this.index = counter;
    }

    public TreeNode(int data, TreeNode parent) {
        this.data = data;
        this.parent = parent;
        this.counter = counter + 1;
        this.index = counter;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        if(parent != null && leftChild != null
                && rightChild != null){
            return "Node{" + "data=" + data +
                    ", parent=" + parent.data +
                    ", leftChild=" + leftChild.data +
            ", rightChild= " + rightChild.data + '}';
        }
        else{
            return "Node{" + "data=" + data +   '}';
        }
    }

    public int getData(){
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    //Getters and setters as appropriate

}
