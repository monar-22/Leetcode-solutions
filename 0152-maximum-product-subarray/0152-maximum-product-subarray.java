class Solution {
    public int maxProduct(int[] nums) {
     int maxnum=nums[0];
        int n=nums.length;
        int pre=1;
        int suf=1;
        
        for(int i=0;i<n;i++){
            if(pre==0)
                pre=1;
            if(suf==0)
                suf=1;
            pre=pre*nums[i];
            suf=suf*nums[n-i-1];
            maxnum=Math.max(maxnum,Math.max(pre,suf));
        }
        return maxnum;
    }
}

