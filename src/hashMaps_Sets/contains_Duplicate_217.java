package hashMaps_Sets;

import java.util.HashSet;

public class contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> myHash = new HashSet<Integer>();

        boolean flag = false;

        for (int i=0; i<nums.length; i++) {
            if (i == 0) {
                myHash.add(nums[i]);
            }
            else {
                if (myHash.contains(nums[i]) == true){
                    flag = true;
                    break;
                }
                myHash.add(nums[i]);
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        System.out.println();
        return;
    }

}
