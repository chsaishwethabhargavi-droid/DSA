// class Solution {
//     int fun(int m , int  n,int i,int j){
//         if(i==n-1 && j==m-1){
//             return 1;
//         }
//         if(i>=n || j>=m){
//             return 0;
//         }
//         int right=fun(m,n,i,j+1);
//         int down=fun(m,n,i+1,j);
//         return right+down;
//     }
//     public int uniquePaths(int m, int n) {
//         int i =0;
//         int j =0;
//         return fun(m,n,i,j);
//     }
// }


class Solution {
    int fun(int m, int n, int i, int j, int[][] memo) {
        if(i == n-1 && j == m-1) {
            return 1;
        }
        if(i >= n || j >= m) {
            return 0;
        }
        if(memo[i][j] != -1) {
            return memo[i][j];
        }
        int right = fun(m, n, i, j+1, memo);
        int down = fun(m, n, i+1, j, memo);
        memo[i][j] = right + down;
        return memo[i][j];
    }
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        return fun(m, n, 0, 0, memo);
    }
}
