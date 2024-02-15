package Problems.Trees;

public class DiameterOfBinaryTree {
    int max = 0;
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        if(root == null)
            return 0;

        diameter = maxdepth(root.left) + maxdepth(root.right);


        max = Math.max(max,diameter);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return max;
    }
    public int maxdepth(TreeNode node){
        if(node == null)
            return 0;

        return 1 + Math.max(maxdepth(node.right),maxdepth(node.left));

    }
}
