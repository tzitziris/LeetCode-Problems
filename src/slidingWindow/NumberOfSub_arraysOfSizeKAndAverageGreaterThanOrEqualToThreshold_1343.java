package slidingWindow;

import java.util.HashSet;

public class NumberOfSub_arraysOfSizeKAndAverageGreaterThanOrEqualToThreshold_1343 {
    class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            HashSet<Integer> window = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {

                if (window.contains(nums[i])) {
                    return true;
                }

                window.add(nums[i]);

                if (window.size() > k) {
                    window.remove(nums[i - k]);
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {

    }

}
