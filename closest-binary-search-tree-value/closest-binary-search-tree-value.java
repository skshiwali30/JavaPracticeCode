/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int closestValue(TreeNode root, double target) {
        int val;
        int min = root.val;
        while(root != null) {
            val = root.val;
            min = Math.abs(val - target) < Math.abs(min - target) ? val : min;
            root = target < root.val ? root.left : root.right;
        }
        return min;
    }
}