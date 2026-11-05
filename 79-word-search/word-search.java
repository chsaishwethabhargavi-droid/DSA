class Solution {
    boolean boo = false;

    void fun(int i, int j, int k, char[][] a, String b){
        if(k==b.length()){
            boo = true;
            return;
        }
        if(i<0 || j<0 || i>=a.length || j>=a[0].length) return;
        if(a[i][j]!=b.charAt(k)) return;

        char c = a[i][j];
        a[i][j] = '#';
        
        fun(i, j+1, k+1, a, b);
        fun(i, j-1, k+1, a, b);
        fun(i+1, j, k+1, a, b);
        fun(i-1, j, k+1, a, b);

        a[i][j] = c;
        
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                fun(i, j, 0, board, word);
                if(boo) return true;
            }
        }

        return boo;
    }
}