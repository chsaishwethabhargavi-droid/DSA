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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        long sum =0;
        List<Long> al = new ArrayList<>();
        while(!q.isEmpty()){
            int n = q.size();
            sum=0;
            for(int i =0;i<n;i++){
                TreeNode cur = q.peek();
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                } 
                sum = sum+cur.val;
                q.poll();  
            }
            al.add(sum);
        }
        if(al.size()<k){
            return -1;
        }
        Collections.sort(al);
        return al.get(al.size() - k);
    }
}