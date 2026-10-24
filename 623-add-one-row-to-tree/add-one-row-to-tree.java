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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(root==null){
            return null;
        }
        if(depth==1){
            TreeNode ne = new TreeNode(val);
            ne.left=root;
            return ne;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int k =1;
        List<Integer> al = new ArrayList<>();
        while(!q.isEmpty()){
        int n = q.size();
        if(k == depth-1){
        for(int i=0;i<n;i++){
            TreeNode cur = q.poll();

            TreeNode l = new TreeNode(val);
            TreeNode r = new TreeNode(val);

            l.left = cur.left;
            r.right = cur.right;

            cur.left = l;
            cur.right = r;
        }
        break;
    }

    for(int i=0;i<n;i++){
        TreeNode cur = q.poll();

        if(cur.left!=null){
            q.add(cur.left);
        }
        if(cur.right!=null){
            q.add(cur.right);
        }
    }

    k++;
}
        return root;
    }
}