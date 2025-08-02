package slidingWindow;

public class Maximum_Average_Subarray_I_643 {

    private double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        int i = 0, j = 0;

        while (j < k) {
            sum += nums[j];
            max = sum;
            j++;
        }
        i++;
        while (j < n) {

            sum += nums[j];
            sum -= nums[i-1];

            max = Math.max(max, sum);

            i++;
            j++;
        }

        return max / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        Maximum_Average_Subarray_I_643 solution = new Maximum_Average_Subarray_I_643();
        double result = solution.findMaxAverage(nums, k);
        System.out.printf("%.5f\n", result);
    }
}
