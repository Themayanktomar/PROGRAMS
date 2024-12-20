package prepinsta.arrays;

import java.util.Arrays;

public class PairClosetToZero {

    // given  a arra of positive and negetive integer now need to find the pair closet to zero
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-9,9,10,-8,6};

        // Find the pair whose sum is closest to zero
        findPairWithClosestSumToZero(arr);
    }

    static void findPairWithClosestSumToZero(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1;
        int closestSum = Integer.MAX_VALUE;  // To store the closest sum
        int bestLeft = -1, bestRight = -1;  // To store the best pair indices

        // Two-pointer approach
        while (left < right) {
            int sum = arr[left] + arr[right];

            // If the absolute sum is smaller than the previous closest, update
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                bestLeft = left;
                bestRight = right;
            }

            // Move pointers based on the sum
            if (sum < 0) {
                left++;  // Increase the sum by moving left pointer to the right
            } else {
                right--;  // Decrease the sum by moving right pointer to the left
            }
        }

        // Output the pair
        System.out.println("The pair whose sum is closest to zero: " +
                arr[bestLeft] + " and " + arr[bestRight]);
    }
}
