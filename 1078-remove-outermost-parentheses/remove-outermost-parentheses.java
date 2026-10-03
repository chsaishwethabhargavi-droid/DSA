class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int count=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(count>1){
                st.push(s.charAt(i));
            }
            if(s.charAt(i)==')'){
                count--;
            }
        }
        String res ="";
        for (char ch : st) {
    res = res + ch;
}
        
        return res;
    }
}