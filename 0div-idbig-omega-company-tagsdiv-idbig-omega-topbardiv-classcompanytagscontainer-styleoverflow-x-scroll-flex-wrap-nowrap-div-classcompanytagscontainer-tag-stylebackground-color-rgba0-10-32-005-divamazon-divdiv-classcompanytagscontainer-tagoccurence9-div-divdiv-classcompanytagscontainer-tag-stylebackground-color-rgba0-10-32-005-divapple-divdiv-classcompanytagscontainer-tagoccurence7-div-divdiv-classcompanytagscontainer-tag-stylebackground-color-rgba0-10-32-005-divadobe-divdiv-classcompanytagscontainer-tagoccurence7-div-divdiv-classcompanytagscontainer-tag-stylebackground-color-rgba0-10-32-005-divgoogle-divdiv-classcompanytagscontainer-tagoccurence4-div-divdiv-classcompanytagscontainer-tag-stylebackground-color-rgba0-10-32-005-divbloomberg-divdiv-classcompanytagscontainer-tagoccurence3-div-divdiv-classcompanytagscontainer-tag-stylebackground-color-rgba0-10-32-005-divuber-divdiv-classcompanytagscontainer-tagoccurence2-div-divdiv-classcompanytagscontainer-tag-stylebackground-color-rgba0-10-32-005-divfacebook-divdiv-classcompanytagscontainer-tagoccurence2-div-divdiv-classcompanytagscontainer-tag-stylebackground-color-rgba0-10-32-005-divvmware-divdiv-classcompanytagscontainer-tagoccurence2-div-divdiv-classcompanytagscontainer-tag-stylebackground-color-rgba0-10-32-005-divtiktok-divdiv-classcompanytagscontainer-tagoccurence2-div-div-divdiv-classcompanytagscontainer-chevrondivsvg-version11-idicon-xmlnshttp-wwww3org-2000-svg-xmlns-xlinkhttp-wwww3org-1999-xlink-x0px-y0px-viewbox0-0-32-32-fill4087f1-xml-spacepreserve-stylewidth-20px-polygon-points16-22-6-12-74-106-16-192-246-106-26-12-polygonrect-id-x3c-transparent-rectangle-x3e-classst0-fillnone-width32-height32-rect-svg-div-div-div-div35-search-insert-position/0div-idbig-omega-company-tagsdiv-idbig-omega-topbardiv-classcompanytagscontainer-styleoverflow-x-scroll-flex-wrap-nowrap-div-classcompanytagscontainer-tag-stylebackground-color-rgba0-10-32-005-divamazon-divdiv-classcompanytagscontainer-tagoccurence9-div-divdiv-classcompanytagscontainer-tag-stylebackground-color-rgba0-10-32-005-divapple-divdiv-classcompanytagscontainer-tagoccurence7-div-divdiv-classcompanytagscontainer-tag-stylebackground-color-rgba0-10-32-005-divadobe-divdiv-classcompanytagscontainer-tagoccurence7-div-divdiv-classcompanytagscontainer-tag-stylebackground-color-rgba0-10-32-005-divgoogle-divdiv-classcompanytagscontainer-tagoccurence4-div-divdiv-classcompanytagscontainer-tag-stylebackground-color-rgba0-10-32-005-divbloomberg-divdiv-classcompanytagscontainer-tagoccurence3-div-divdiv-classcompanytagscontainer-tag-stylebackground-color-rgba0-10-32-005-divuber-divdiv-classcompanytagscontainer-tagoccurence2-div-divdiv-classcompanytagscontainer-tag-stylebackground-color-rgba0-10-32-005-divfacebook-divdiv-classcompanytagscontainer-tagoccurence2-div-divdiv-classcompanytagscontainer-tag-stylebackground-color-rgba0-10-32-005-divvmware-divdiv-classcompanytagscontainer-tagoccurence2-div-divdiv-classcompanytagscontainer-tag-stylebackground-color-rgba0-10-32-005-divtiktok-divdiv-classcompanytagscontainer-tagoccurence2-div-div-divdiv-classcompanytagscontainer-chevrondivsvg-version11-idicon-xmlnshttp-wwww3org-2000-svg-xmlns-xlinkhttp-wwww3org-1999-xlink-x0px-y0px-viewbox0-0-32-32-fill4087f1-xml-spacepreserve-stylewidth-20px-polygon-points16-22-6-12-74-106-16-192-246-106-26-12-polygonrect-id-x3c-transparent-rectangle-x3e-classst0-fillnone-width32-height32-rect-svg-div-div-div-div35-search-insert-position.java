class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length -1;
        int res = nums.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>=target){
                res=mid;
                high = mid-1;
            }
            else if (nums[mid]<target){
                low =  mid + 1;
            }
        }
        return res;
    }
}