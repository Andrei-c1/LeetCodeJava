package Problems.Trees;

class subTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        if (subRoot == null || dfs(root, subRoot)) return true;
        if (root == null) return false;

        boolean left = isSubtree(root.left, subRoot);
        boolean right = isSubtree(root.right, subRoot);

        return left || right;

    }

    boolean dfs(TreeNode r , TreeNode s){
        if(r == null && s == null)
            return true;
        if(r == null || s == null)
            return false;

        boolean left = dfs(r.left,s.left);
        boolean right = dfs(r.right,s.right);

        return left && right;
    }
}

