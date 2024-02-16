class Solution {
    public int findNonMinOrMax(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        if(l>2){
            return nums[1];
            }
        else
            return -1;
    }
}