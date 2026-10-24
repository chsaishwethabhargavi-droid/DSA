/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
       
        while(!q.isEmpty()){
            Node nn = null;
            int n = q.size();
            List<Integer> al = new ArrayList<>();
            for(int i =0;i<n;i++){
                Node cur = q.poll();
                if(nn!=null){
                    nn.next =cur;
                }
                nn=cur;
                if(cur.left!=null){
                    q.add(cur.left);
                }  
                if(cur.right!=null){
                    q.add(cur.right);
                }
    
            }
            nn.next = null;
        }
        return root;
    }
}