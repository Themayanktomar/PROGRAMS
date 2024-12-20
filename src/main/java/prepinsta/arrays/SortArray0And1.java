package prepinsta.arrays;

import java.util.Arrays;

public class SortArray0And1 {



    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 0, 0, 1, 0, 1};
        int low = 0, high = arr.length - 1;

        while (low < high){

            if (arr[low] == 0) {
                low++;


            } else if (arr[high] == 1) {
                high--;
            }
            else {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
