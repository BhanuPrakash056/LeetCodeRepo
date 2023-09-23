class Solution {
    public int singleNonDuplicate(int[] nums) {
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = sum ^ nums[i];
        }
        return sum;
    }
}