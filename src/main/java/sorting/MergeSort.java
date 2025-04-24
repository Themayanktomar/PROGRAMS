package sorting;

public class MergeSort {

    public static void conquer(int[] arr ,int si , int mid  , int ei)
    {

        int[] merged = new int[ei-si+1];
        int ind1 = si;
        int ind2 = mid+1;
        int x  = 0;

        while (ind1 <= mid && ind2 <= ei){

            if (arr[ind1] <= arr[ind2])
            {
                merged[x] = arr[ind1];
                x++ ; ind1++;
            }else {
                merged[x]  = arr[ind2];
                x++; ind2++;
            }
        }
        while(ind1 <= mid)
        {
            merged[x] = arr[ind1];
            x++ ; ind1++;
        }
        while (ind2 <= ei) {
            merged[x]  = arr[ind2];
            x++; ind2++;
        }

        for (int i  = 0  , j=si ; i <merged.length ; i++ , j++)
        {
            arr[j]  = merged[i];
        }
    }

    public static void devide(int[] arr , int si , int ei)
    {
        if (si>=ei)
        {
            return;
        }

        int mid = si + (ei-si)/2;
        devide(arr , si , mid);
        devide(arr , mid+1  , ei);
        conquer(arr , si , mid , ei);
    }


    public static void main(String[] args) {
        int[] arr = {1,4,5,2,3};
        int n  = arr.length;
        devide(arr , 0 , n-1);

        for (int i =0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i] + " ");
        }

    }
}
