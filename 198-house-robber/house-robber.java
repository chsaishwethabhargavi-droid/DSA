class Solution {
    int fun(int[] cost,int id,int[] memo){
        if(id>=cost.length)
        return 0;
        if(memo[id]!=-1){
            return memo[id];
        }
        memo[id]=cost[id]+Math.max(fun(cost,id+2,memo),fun(cost,id+3,memo));
        return memo[id];
    }
    public int rob(int[] cost) {
        int memo[] = new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.max(fun(cost,0,memo),fun(cost,1,memo));
    }
}