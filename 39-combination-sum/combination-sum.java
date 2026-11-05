class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void find(int[] arr,int t, int idx, ArrayList<Integer> al){
        if( idx>=arr.length){
            return;
        }
        if(t==0){
            ans.add(new ArrayList<>(al));
            return;
        }
        if(t<0) return;
        al.add(arr[idx]);
        find(arr,t-arr[idx],idx,al);
        al.remove(al.size()-1);
        find(arr,t,idx+1,al);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        find(candidates, target, 0, al);
        return ans;
    }
}