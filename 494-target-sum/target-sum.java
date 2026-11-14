class Solution {
    int count =0;
    void fun(int[] arr, int i , int sum, int target){
        if(i>=arr.length){
            if(sum==target){
                count++;
            }
            return;
        }
        fun(arr,i+1,sum+arr[i],target);
        fun(arr,i+1,sum-arr[i],target);
    }
    public int findTargetSumWays(int[] nums, int target) {
        fun(nums,0,0,target);
        return count;
    }
}