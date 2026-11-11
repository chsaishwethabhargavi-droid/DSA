class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void fun(int[] nums,int lvl){
        if(lvl==nums.length){
            List<Integer> al = new ArrayList<>();
            for(int i =0;i<nums.length;i++){
                al.add(nums[i]);
            }
            ans.add(al);
            return;
        }
        for(int i =lvl;i<nums.length;i++){
            int temp = nums[lvl];
            nums[lvl]=nums[i];
            nums[i]=temp;
            fun(nums,lvl+1);
            temp = nums[lvl];
            nums[lvl]=nums[i];
            nums[i]=temp;
            
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        fun(nums,0);
        return ans;
    }
}