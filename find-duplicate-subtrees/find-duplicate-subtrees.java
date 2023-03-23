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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        if(root == null)
            return res;
        Map<String, Integer> hm = new HashMap<>();
        traverse(root, hm, res);
        return res;
    }
    public String traverse(TreeNode root, Map<String, Integer> hm, List<TreeNode> res) {
        if(root == null)
            return "";
        String left = traverse(root.left, hm, res);
        String right = traverse(root.right, hm, res);
        String str = root.val + "," + left + "," + right;
        hm.putIfAbsent(str, 0);
        hm.put(str, hm.get(str) + 1);
        if(hm.get(str) == 2) {
            res.add(root);
        }
        return str;
    }
}