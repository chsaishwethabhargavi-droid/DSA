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
    int right(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count =0;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i =0;i<n;i++){
                TreeNode cur = q.peek();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                } 
                al.add(cur.val);
                q.poll();  
            }
            ans.add(al);
        }
        count = ans.size();
        return count;
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int l = right(root.left);
        int r =right(root.right);
        if(Math.abs(l-r)<=1){
            return isBalanced(root.left)&&isBalanced(root.right);
        }
        return false;
    }
}