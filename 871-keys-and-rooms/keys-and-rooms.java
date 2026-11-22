class Solution {
     void fun(List<List<Integer>> adj,boolean vis[],List<Integer> al , int start){
        if(vis[start]) return;
        vis[start]=true;
        al.add(start);
        for(int i :adj.get(start)){
            fun(adj,vis,al,i);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
         ArrayList<Integer> al  = new ArrayList<>();
        if(adj.size()==0){
            return true;
        }
        boolean vis[] = new boolean[adj.size()];
        fun(adj,vis,al,0);
        for(int i = 0; i < vis.length; i++) {
            if(!vis[i]) {
                return false;
            }
        }
        return true;
    }
}