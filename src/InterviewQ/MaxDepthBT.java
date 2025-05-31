package InterviewQ;

public class MaxDepthBT {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return preOrder(root);
    }
    public static int preOrder(TreeNode root){
        if(root == null) return 0;
        int leftDepth = preOrder(root.left);
        int rightDepth = preOrder(root.right);
        return Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {

    }
}
