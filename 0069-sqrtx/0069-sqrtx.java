class Solution {
    public int mySqrt(int x) {
        int s=0,e=x;
        while(s<=e){
            int mid = s + (e-s)/2;
            if((long)mid*mid==x){
                return mid;
            }
            if((long)mid*mid > x){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return s-1;
    }
}