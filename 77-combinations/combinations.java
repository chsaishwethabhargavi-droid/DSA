class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void find(int[] arr, int idx, ArrayList<Integer> al,int k){
        if(al.size()==k){
            ans.add(new ArrayList<>(al));
            return;
        }
        if( idx>=arr.length ){
            return;
        }
        al.add(arr[idx]);
        find(arr,idx+1,al,k);
        al.remove(al.size()-1);
        find(arr,idx+1,al,k);
    }
    public List<List<Integer>> combine(int n, int k) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        find(arr,0,new ArrayList<Integer>(),k);
        return ans;
    }
}