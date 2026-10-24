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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int k =0;
        TreeNode l = new TreeNode();
        TreeNode r = new TreeNode();
        while(!q.isEmpty()){
            k++;
            int n = q.size();
            List<TreeNode> al = new ArrayList<>();
            for(int i =0;i<n;i++){
                TreeNode cur = q.poll();
                al.add(cur);
                if(cur.left!=null){
                    q.add(cur.left);
                }  
                if(cur.right!=null){
                    q.add(cur.right);
                }
    
            }
            if(k%2==0){
               int i=0;int j=n-1;
                while(i<j){
                    int temp = al.get(i).val;
                    al.get(i).val=al.get(j).val;
                    al.get(j).val=temp;

                    i++;
                    j--;
                }
                
            }
        }
        return root;
    }
}