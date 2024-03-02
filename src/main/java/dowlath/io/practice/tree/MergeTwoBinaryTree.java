package dowlath.io.practice.tree;

import dowlath.io.practice.tree.TreeNode1;

/*

    Tree 1

    1 3 2 5

    Tree 2

    2 1 3 1 7

    output:

    3 4 5 5 4 7


 */
public class MergeTwoBinaryTree {
    TreeNode1 t1 = new TreeNode1();
    TreeNode1 t2 = new TreeNode1();
    TreeNode1 t3 = mergeTrees(t1,t2);

    private TreeNode1 mergeTrees(TreeNode1 t1, TreeNode1 t2) {
        if(t1 == null && t2 == null) return null;
        if(t1 == null ) return t2;
        if(t2 == null ) return t1;

        TreeNode1 output = new TreeNode1(t1.val+t2.val);
        output.left = mergeTrees(t1.left,t2.left);
        output.left = mergeTrees(t1.right,t2.right);
        return output;
    }

}
