public class BinaryTree_Demo {
    //this is binarysearch tree
    public static void main(String[] args){
        BinaryTree tree=new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inorder();
        System.out.println();
        tree.postorder();
        System.err.println();
        tree.preorder();
    }
}
