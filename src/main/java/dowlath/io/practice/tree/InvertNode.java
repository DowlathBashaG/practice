package dowlath.io.practice.tree;

/*
        Input 4 2 7 1 3 6 9
        Output 4 7 2 9 6 3 1
 */
public class InvertNode {

    public TreeNode1 invertTree(TreeNode1 root){
        invert(root);
        return root;
    }

    // Logic is here
    private void invert(TreeNode1 node) {
        if(node == null) return;
        TreeNode1 tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        invert(node.left);
        invert(node.right);

    }
   // logic is end

    public static void main(String[] args) {
        TreeNode1 tn = new TreeNode1();
        InvertNode in = new InvertNode();
        in.invert(tn);
    }
}
