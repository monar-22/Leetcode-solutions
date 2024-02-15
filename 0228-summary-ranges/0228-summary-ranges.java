import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int start = nums[i];
            while (i < len - 1 && nums[i] + 1 == nums[i + 1]) {
                i++;
            }
            int end = nums[i];
            if (start == end) {
                ls.add(String.valueOf(start));
            } else {
                ls.add(start + "->" + end);
            }
        }
        return ls;
    }
}
