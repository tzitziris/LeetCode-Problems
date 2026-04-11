package arrays;

import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
//        boolean flag = true;
//        for (int i = 0; i < digits.length; i++) {
//            if (digits[i] != 9) {
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag == true) {
//            int[] numbers = new int[digits.length + 1];
//        } else {
//            int[] numbers = new int[digits.length];
//        }
        return digits;
    }
}

public class Plus_One_66 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {9, 9, 9};
        int[] result = solution.plusOne(digits);

        // Τυπώνουμε τα στοιχεία του array σωστά
        // System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
        
    }
}
