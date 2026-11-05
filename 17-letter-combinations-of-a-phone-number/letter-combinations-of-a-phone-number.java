class Solution {
    String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    void find(String str, int idx,String ans, ArrayList<String> al){
        if(idx>=str.length()){
            al.add(ans);
            return;
        }
        String key = arr[str.charAt(idx)-'0'];
        for(int i =0;i<key.length();i++){
            find(str,idx+1,ans+key.charAt(i),al);
        }
    }
    public List<String> letterCombinations(String str) {
        ArrayList<String> al = new ArrayList<String>();
        find(str,0,"",al);
        return al;
    }
}