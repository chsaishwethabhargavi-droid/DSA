class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i =0;
        int j =0;
        Stack<Integer> st = new Stack<>();
        while(i<pushed.length){
            st.push(pushed[i]);
            i++;
        
        while(j<popped.length && !st.isEmpty() && st.peek()==popped[j]){
            st.pop();
            j++;
        }
        }
        return j == popped.length;
        // while(i!=pushed.length){
        // if(pushed[i]!=popped[j]){
        //     st.push(pushed[i]);
        //     i++;
        // }
        // if(pushed[i]==popped[j]){
        //     i++;j++;
        // }
        // }

        // // if(i>=pushed.length){
        // //     i=i-j;
        // while(j!=popped.length+1){
        //     if(st.peek()==popped[j]){
        //     st.pop();
        //     j++;
        //     }
        // }
        // // }
        // // }
        // // else if(j==popped[j]){
        // //     return true;
        // // }
        // // }
    }
}