class Solution {
    public int[] diStringMatch(String s) {
       char[] ch = s.toCharArray();
       int[] arr = new int[s.length()+1];
       int i = 0;int d = s.length();int k =0;int j =0;
       while(i<d){
        if(s.charAt(j)=='I'){
            arr[k]=i;
            i++;
        }
        else if(s.charAt(j)=='D'){
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