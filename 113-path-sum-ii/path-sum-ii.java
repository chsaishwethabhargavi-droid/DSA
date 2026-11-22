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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        ArrayList<Integer> al = new ArrayList<>();
        dfs(root, targetSum, al);
        return ans;
    }
    void dfs(TreeNode root, int sum, ArrayList<Integer> al) {
        if(root == null) {
            return;
        }
        al.add(root.val);
        sum = sum - root.val;
        if(root.left == null && root.right == null) {
            if(sum == 0) {
                ans.add(new ArrayList<>(al));
            }
        }
        dfs(root.left, sum, al);
        dfs(root.right, sum, al);
        al.remove(al.size()-1);
    }
}