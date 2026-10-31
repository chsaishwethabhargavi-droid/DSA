class Solution {
    int fun(int[] cost,int id,int end,int[] memo){
        if(id>end)
        return 0;
        if(memo[id]!=-1){
            return memo[id];
        }
        memo[id]=Math.max(cost[id]+fun(cost,id+2,end,memo),fun(cost,id+1,end,memo));
        
        return memo[id];
    }
    public int rob(int[] cost) {
        int n = cost.length;
        if(n==1) return cost[0];
        int memo[] = new int[cost.length];
        int memo1[] = new int[cost.length];
        Arrays.fill(memo,-1);
        Arrays.fill(memo1,-1);
        return Math.max(fun(cost,0,n-2,memo),fun(cost,1,n-1,memo1));
    }
}