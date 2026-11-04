/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // void fun(TreeNode root, TreeNode p, TreeNode q,List<Integer> al1,List<Integer> al2){
    //     if(root == null){
    //         return;
    //     }
    //     fun(root.left,p,q,al1,al2);
    //     fun(root.right,p,q,al1,al2);
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // List<Integer> al1 = new ArrayList<>();
        // List<Integer> al2 = new ArrayList<>();
        // fun(root,p,q,al1,al2);
        // System.out.println(al1);
        // System.out.println(al2);
        // int i = p.val;
        // if(al1.size()==0||al2.size()==0){
        //     return root;
        // }
        // if(al1.get(0)==al2.get(0)){
        //     TreeNode t = new TreeNode(al1.get(0));
        //     return t;
        // }
        // else if(al1.get(0)!=al2.get(0)){
        //     TreeNode t1=new TreeNode(i);
        //     return t1;
        // }
        // return root;
        if(root==null||root==p||root==q){
            return root;
        }
        TreeNode left = new TreeNode();
        TreeNode right = new TreeNode();
        left =  lowestCommonAncestor(root.left,p,q);
        right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null)
        return root;
        return left==null ? right: left;
    }
}