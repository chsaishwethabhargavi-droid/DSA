class Solution {
    void find(int ob,int cb,ArrayList<String> al , String ans){
        if(ob==0&& cb ==0){
            al.add(ans);
            return;
        }
        if(ob>0)
        find(ob-1,cb,al,ans+"(");
        if(cb>ob)
        find(ob,cb-1,al,ans+")");
    }
    public List<String> generateParenthesis(int n) {
       ArrayList<String> al= new ArrayList<>();
       find(n,n,al,"");
       return al; 
    }
}