package Q1448;

class Solution {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private int countGoodNodes(TreeNode node, int maxCurrent){
        if(node == null) return 0;

        int count = 0;

        if(node.val >= maxCurrent){
            count = 1;
            maxCurrent = node.val;
        }

        count += countGoodNodes(node.left, maxCurrent);
        count += countGoodNodes(node.right, maxCurrent);

        return count;
    }

    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, Integer.MIN_VALUE);
    }
}