class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1){
            return true;
        }
        long start = 1;
        long end = num;
        while (start <= end) {
            long mid = (start+(( end - start) / 2));
            long x = mid*mid;
            if (x== num) {
                return true;
            } 
            else if (x > num) {
                end = mid - 1;
            } 
            else {
                start = mid + 1;
            }
        }
        return false;
    }
}