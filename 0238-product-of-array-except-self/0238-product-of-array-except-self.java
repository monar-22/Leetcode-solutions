class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1;
        int post=1;
        int res[] =  new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=pre;
            pre=nums[i]*pre;
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]=post*res[i];
            post=nums[i]*post;
        }
        return res;
    }
}