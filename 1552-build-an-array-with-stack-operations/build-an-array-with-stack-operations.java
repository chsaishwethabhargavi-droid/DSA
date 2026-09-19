class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> st = new Stack<>();
        int i =0;
        for(int j =1;j<=n;j++){
            st.push("Push");
            if(target[i]==j){
                i++;
                if(i==target.length){
                    break;
                }
            }
            else{
                st.push("Pop");
            }
        }
        return st;
    }
}