public class July_31_1 {
    public boolean doesRepresentBST(int[] arr) {
        // code here
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
            return false;
        }
        return true;
    }
}
//Given an array arr[] of size n containing unique elements, check whether it represents the inorder traversal of a Binary Search Tree (BST) or not.