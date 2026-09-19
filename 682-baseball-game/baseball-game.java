class Solution {
    public int calPoints(String[] operations) {
       Stack<Integer> st = new Stack<>();
       for(int i =0;i<operations.length;i++){ 
       if(operations[i].equals("C")){
        st.pop();
       }
       else if(operations[i].equals("D")){
        int a=st.peek();
        st.push(2*a);
       }
       else if(operations[i].equals("+")){
        int z = st.pop();
        int x = st.pop();
        st.push(x);
        st.push(z);
        st.push(x+z);
       }
       else{
        st.push(Integer.parseInt(operations[i]));
       }
       }
       int sum =0;
       while(st.isEmpty()==false){
        sum = sum+ st.peek();
        st.pop();
       }
       return sum;
    }
}