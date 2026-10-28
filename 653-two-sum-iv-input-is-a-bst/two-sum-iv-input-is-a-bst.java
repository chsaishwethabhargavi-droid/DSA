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
     void inorder(TreeNode root, List<Integer> l){
        if(root==null){
            return;
        }
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l = new ArrayList<>();
        inorder(root,l);
        for(int i =0;i<l.size();i++){
            for(int j =i+1;j<l.size();j++){
                if(l.get(i)+l.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
}