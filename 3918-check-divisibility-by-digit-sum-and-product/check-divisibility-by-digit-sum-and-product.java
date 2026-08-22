class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum =0;
        int mul =1;
        while(n>0){
            int r = n%10;
            sum = sum+r;
            mul = mul*r;
            n = n/10;
        }
        int x = sum+mul;
        if(temp%x==0){
            return true;
        }
        return false;
    }
}