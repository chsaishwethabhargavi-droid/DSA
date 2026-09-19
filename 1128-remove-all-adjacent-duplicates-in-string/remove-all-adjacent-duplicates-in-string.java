class Solution {
    public String removeDuplicates(String s) {
      Stack<String> st = new Stack<>();
      for(int i =0;i<s.length();i++){
        if(st.isEmpty()==true){
            st.push(String.valueOf(s.charAt(i)));
        }
        else if(String.valueOf(s.charAt(i)).equals(st.peek())){
            st.pop();
        }else{
        st.push(String.valueOf(s.charAt(i)));
        } 
      } 
      String res = "";
      while(st.isEmpty()==false){
        res = res + st.peek();
        st.pop();
      }
      String rev = "";
      int i = res.length()-1;
      while(i>=0){
        rev = rev + res.charAt(i);
        i--;;
      }

      return rev;
    }
}