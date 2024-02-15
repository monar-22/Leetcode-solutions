class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l=nums.size();
        int ctr=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(nums.get(i)+nums.get(j)<target)
                    ctr++;
            }
        }
        return ctr;
    }
}