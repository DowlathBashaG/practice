package dowlath.io.practice.tree;

import dowlath.io.practice.tree.TreeNode1;

public class SymmetricTree {
    // left node is left and right node is right  & left node right and right node left ... this is the logical of this qn.

   // [1 2 2 3 4 4 3] this symmetic tree. but the following is not symmetric tree : [ 1,2,2,null,3,null,3 ]

    public static void main(String[] args) {
        TreeNode1 treeNode = new TreeNode1();
        boolean isItSymmetric = isSymmetric(treeNode);
        System.out.println(isItSymmetric);

    }

    private static boolean isSymmetric(TreeNode1 root) {
        if(root == null) return true;
        return helper(root.left,root.right);
    }
    public static boolean helper(TreeNode1 left, TreeNode1 right){
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return helper(left.left,right.right) && helper(left.right,right.left);
    }
}


