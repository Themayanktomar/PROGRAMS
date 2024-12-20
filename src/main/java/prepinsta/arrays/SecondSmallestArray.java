package prepinsta.arrays;

public class SecondSmallestArray {

    public static void main(String[] args)

    {


        int[]  arr = {10,20,30,40};
        int smallest = arr[0];
        for(int i = 0 ; i<arr.length ; i++)

        {
            if(arr[i] < smallest)

            {

                smallest = arr[i];
            }
        }
        int secSmallest = Integer.MIN_VALUE;
        for(int j = 0 ; j<arr.length ; j++)

        {
            if(arr[j] != smallest && arr[j] < secSmallest)
            {
                secSmallest = arr[j];
            }
        }
        System.out.println("Second smalles is :" + secSmallest);

    }

}
