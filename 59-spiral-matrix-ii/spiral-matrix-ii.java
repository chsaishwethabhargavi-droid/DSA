class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat= new int[n][n];
        int top=0;
        int bottom=mat.length-1;
        int left=0;
        int right=mat[0].length-1;
        int k =1;
        List<Integer> al = new ArrayList<>();
        while(top <= bottom && left<=right){
            for(int i =left;i<=right;i++){
                mat[top][i]=k++;
            }
            top++;
            for(int i =top;i<=bottom;i++){
                mat[i][right]=k++;
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                mat[bottom][i]=k++;
            }
            bottom--;
            }
            if(left<=right){
            for(int i = bottom;i>=top;i--){
                mat[i][left]=k++;
            }
            left++;
            }
        }
        return mat;
    }
}