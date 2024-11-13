package prepinsta.arrays;

import java.util.Arrays;

public class SortArrayElements {

    private static void sortArr(int[] arr)
    {
        int temp = 0;
        for (int i = 0 ; i < arr.length ; i++)
        {
            for (int j = i+1; j<arr.length ; j++)
            {
               if (arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }

            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        sortArr(new int[]{10,55,5,88});

    }
}
