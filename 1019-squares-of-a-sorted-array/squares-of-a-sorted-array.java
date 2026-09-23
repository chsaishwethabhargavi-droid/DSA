class Solution {
    public int[] sortedSquares(int[] arr) {
        int i =0;
        int j = arr.length-1;
        int k = arr.length-1;
        int[] num = new int[arr.length];
        while(i<=j){
            if(arr[i] * arr[i]>arr[j] * arr[j]){
                num[k] = arr[i]*arr[i];
                i++;
            }
            else{
                num[k] = arr[j] * arr[j];
                j--;
            }
            k--;
        }
        return num;
    }
}