class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>();
        // for(int i =0;i<arr.length;i++){ 
        //      int count=0;   
        //  for(int j =i+1;j<arr.length;j++){
        //     if(arr[i] < arr[j]){
        //         st.push(count+1);
        //             break;
        //     }
        //     count++;
        //  }
        //   if(st.size() == i){
        //         st.push(0);
        //     }
        // }
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = st.get(i);
        // }

        // return arr;
        int i = arr.length -1;
        while(i>=0){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                a.add(0);
            }
            else{
                a.add(st.peek()-i);
            }
            st.push(i);
            i--;
        }
        Collections.reverse(a);
        int[] arr1 = new int[arr.length];
        for(int l = 0; l < arr.length; l++){
            arr1[l] = a.get(l);
        }
        return arr1;
    }
}