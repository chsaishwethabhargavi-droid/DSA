class Solution {
    public String mergeAlternately(String word1, String word2) {
        char arr[] =  new char[word1.length()+word2.length()];
        int i=0;int j=0;int k =0;
        while(i<word1.length()||j<word2.length()){
            if(i<word1.length()){
               arr[k++] =word1.charAt(i);
                i++; 
            }
            if(j<word2.length()){
                arr[k++]=word2.charAt(j);
            j++;
            }
            
        }
        return new String(arr);
    }
}