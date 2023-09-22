class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                res = mid;
                high = mid -1;
            }
            else{
                low = low + 1;
            }
        }
        return res==-1 ? nums.length : res;
    }
}