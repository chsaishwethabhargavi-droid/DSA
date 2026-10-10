class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(i);
        }
        int j =0;
        while(al.size()>1){
            j = (j+(k-1))%al.size();
            al.remove(j);
            
        }
        // int m = (int) Math.round((double) n / k); 
        return al.get(0);
    }
}