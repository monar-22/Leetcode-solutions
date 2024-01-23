class Solution {
    public int minimumSum(int[] nums) {        
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = j+1;
            while(j<n && k< n){
                if(nums[i] < nums[j] && nums[k] < nums[j]){
                    int sum = nums[i] + nums[j] + nums[k];
                    min = Math.min(min, sum);                   
                }
                 k++;
                if (k >= n) {
                    j++;
                    k = j + 1;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;        
    }
}