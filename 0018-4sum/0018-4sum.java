import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if (i != 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int l = j + 1;
                int k = len - 1;
                while (l < k) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[k]; 

                    if (Math.abs(sum - target) < 1) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[l], nums[k]);
                        res.add(temp);
                        l++;
                        k--;

                        while (l < k && nums[l] == nums[l - 1])
                            l++;
                        while (l < k && nums[k] == nums[k + 1])
                            k--;
                    } else if (sum > target) {
                        k--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
