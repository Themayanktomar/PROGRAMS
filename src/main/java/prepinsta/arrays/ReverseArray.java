package prepinsta.arrays;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10 , 11 ,12,13,14};
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length-1 ; i>0 ; i--)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversedArr));
    }
}
