package arrays;

import java.util.HashMap;

public class Two_Sum_1 {
    public int[] twoSum(int[] nums, int target) {
        // int tmp1 = -1;
        // int tmp2 = -1;

        // for (int i = 0; i<nums.length; i++) {
        //     for(int j = i+1; j<nums.length; j++) {
        //         if (nums[i] + nums[j] == target){
        //             tmp1 = i;
        //             tmp2 = j;
        //         }
        //     }
        // }

        int tmp1 = -1;
        int tmp2 = -1;

        HashMap<Integer, Integer> myHash = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (myHash.containsKey(target - nums[i])) {
                tmp1 = i;
                tmp2 = myHash.get(target - nums[i]);
            }
            else {
                myHash.put(nums[i], i);
            }
        }

        int [] tmp3 = new int[2];
        if (tmp1 != -1 && tmp2 != -1){
            tmp3[0] = tmp1;
            tmp3[1] = tmp2;
        }

        return tmp3;
    }
}
