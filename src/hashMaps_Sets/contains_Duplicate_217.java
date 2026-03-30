package hashMaps_Sets;

import java.util.HashSet;
import java.util.Set;

public class contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> myHash = new HashSet();
        for (int i = 0; i < n; i++) {
            if (myHash.contains(nums[i]) == true) {
                return true;
            }
            myHash.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println();
        return;
    }

}
