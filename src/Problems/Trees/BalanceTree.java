package Problems.Trees;

public class BalanceTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        int right = dfs(root.right);
        int left  = dfs(root.left);

        System.out.println(right);
        System.out.println(left);

        if(Math.abs(right-left) > 1)
            return false;

        return true;

    }
    int dfs(TreeNode root){
        if(root == null)
            return 0;

        int l = dfs(root.left);
        int r = dfs(root.right);

        return 1 + Math.max(l,r);



    }
}
