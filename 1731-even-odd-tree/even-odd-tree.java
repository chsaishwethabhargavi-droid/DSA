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
    public boolean isEvenOddTree(TreeNode root) {
        int level=0;
        if(root==null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
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
                q.remove(); 
            }
            for(int i =0;i<al.size();i++){
                int val=al.get(i);
                if(level%2==0){
                    if(val%2==0){
                        return false;
                    }
                    if(i>0&&al.get(i-1)>=val){
                        return false;
                    }
                }    
                else{
                if(val%2!=0){
                    return false;
                }
                if(i>0&&al.get(i-1)<=val){
                    return false;
                }
            }
            }
            level++;
        }
        return true;
    }
}