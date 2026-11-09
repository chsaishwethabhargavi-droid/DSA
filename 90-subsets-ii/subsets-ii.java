class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void find(int[] arr, int idx, ArrayList<Integer> al){
        ans.add(new ArrayList<>(al));
        for(int i =idx;i<arr.length;i++){
            if(i>idx&&arr[i]==arr[i-1]){
                continue;
            }
        al.add(arr[i]);
        find(arr,i+1,al);
        al.remove(al.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        find(arr,0,new ArrayList<>());
        return ans;
    }
}