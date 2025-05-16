package arrays;

public class Two_Sum_II_Input_Array_Is_Sorted_167 {

//  Time Complexity	O(n)
//  Space Complexity	O(1)

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        int[] tmp = new int[2];

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == target){
                tmp[0] = left + 1;
                tmp[1] = right + 1;
                break;
            }

            if (numbers[left] + numbers[right] > target){
                right --;
            } else {
                left ++;
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Two_Sum_II_Input_Array_Is_Sorted_167 solution = new Two_Sum_II_Input_Array_Is_Sorted_167();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(numbers, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }


}
