class Solution {
    public int  gcd(int a,int b){
         if(a==0)
            return b;
        return gcd(b%a,a);
    }
    
    public int findGCD(int[] nums) {
       int n= nums.length;
        int min = nums[0];
        int max = nums[0];
        
        for(int i=1;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        return gcd(min,max);
    }

}