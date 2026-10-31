class Solution {
    int fun(int[] cost,int id,int[] memo){
        if(id>=cost.length)
        return 0;
        if(memo[id]!=-1){
            return memo[id];
        }
        memo[id]=cost[id]+Math.min(fun(cost,id+1,memo),fun(cost,id+2,memo));
        return memo[id];
    }
    public int minCostClimbingStairs(int[] cost) {
        int memo[] = new int[cost.length];
        Arrays.fill(memo,-1);
        return Math.min(fun(cost,0,memo),fun(cost,1,memo));
    }
}