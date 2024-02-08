class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int sum=nums[0];
        int currsum=0;
        for(int i=1;i<nums.length;i++){
            currsum= sum+ nums[i];
            sum=Math.max(currsum,nums[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}