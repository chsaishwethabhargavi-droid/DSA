class Solution {
    public int[] diStringMatch(String s) {
       int[] arr = new int[s.length()+1];
       int i = 0;int d = s.length();int k =0;int j =0;
       while(i<d){
        if(s.charAt(k)=='I'){
            arr[k]=i;
            i++;
        }
        else if(s.charAt(k)=='D'){
            arr[k]=d;
            d--;
        }
        k++;
        j++;
       }
       arr[k]=i;
       return arr;
    }
}