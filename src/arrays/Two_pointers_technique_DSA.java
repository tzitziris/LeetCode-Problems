package arrays;

import java.util.ArrayList;
import java.util.List;

public class Two_pointers_technique_DSA {

    public List<Integer> combine (int [] arr1, int [] arr2) {
        List<Integer> mylist = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mylist.add(arr1[i]);
                i++;
            } else {
                mylist.add(arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            mylist.add(arr1[i]);
            i++;
        }

        // Add remaining elements from arr2
        while (j < arr2.length) {
            mylist.add(arr2[j]);
            j++;
        }

        return mylist;

    }

    public static void main(String[] args) {
        Two_pointers_technique_DSA solution = new Two_pointers_technique_DSA();

        // Test Case 1: Basic Case
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        List<Integer> result1 = solution.combine(arr1, arr2);
        System.out.println("Test Case 1: " + result1);
        // Expected: [1, 2, 3, 4, 5, 6]

        // Test Case 2: One Array Empty
        int[] arr3 = {};
        int[] arr4 = {1, 2, 3};
        List<Integer> result2 = solution.combine(arr3, arr4);
        System.out.println("Test Case 2: " + result2);
        // Expected: [1, 2, 3]

        // Test Case 3: Arrays of Different Lengths
        int[] arr5 = {1, 2, 4, 6};
        int[] arr6 = {3, 5};
        List<Integer> result3 = solution.combine(arr5, arr6);
        System.out.println("Test Case 3: " + result3);
        // Expected: [1, 2, 3, 4, 5, 6]

        // Test Case 4: Duplicate Values
        int[] arr7 = {1, 2, 2, 3};
        int[] arr8 = {2, 3, 4};
        List<Integer> result4 = solution.combine(arr7, arr8);
        System.out.println("Test Case 4: " + result4);
        // Expected: [1, 2, 2, 2, 3, 3, 4]

        // Test Case 5: All Elements in One Array Smaller
        int[] arr9 = {10, 20, 30};
        int[] arr10 = {1, 2, 3};
        List<Integer> result5 = solution.combine(arr9, arr10);
        System.out.println("Test Case 5: " + result5);
        // Expected: [1, 2, 3, 10, 20, 30]

        // Test Case 6: Negative Numbers
        int[] arr11 = {-5, 0, 5};
        int[] arr12 = {-3, 3};
        List<Integer> result6 = solution.combine(arr11, arr12);
        System.out.println("Test Case 6: " + result6);
        // Expected: [-5, -3, 0, 3, 5]
    }
}
