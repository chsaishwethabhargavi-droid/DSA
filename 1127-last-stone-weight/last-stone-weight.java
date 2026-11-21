class Solution {
    public int lastStoneWeight(int[] stones) {
        int i = stones.length-1;
        while(i!=0){
            int m =0;
            Arrays.sort(stones);
            if(stones[i]!=0&&stones[i-1]!=0){
                m = stones[i]-stones[i-1];
                if(m==0){
                    stones[i]=0;
                    stones[i-1]=0;
                }
                else{
                    stones[i]=0;
                    stones[i-1]=m;
                }

            }
            else{
                return stones[i];
            }
        }
        return stones[i];
    }
}