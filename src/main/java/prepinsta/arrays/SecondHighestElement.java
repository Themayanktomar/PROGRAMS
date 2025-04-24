package prepinsta.arrays;

public class SecondHighestElement {

    public static void main(String[] args) {

        int[] arr = {10,20,30};
        int max = Integer.MIN_VALUE;
        int secMAx = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length ; i++)
        {
            if (arr[i] > max)
            {
                secMAx = max;
                max = arr[i];
            } else if (arr[i] > secMAx && secMAx!= max) {
                secMAx = arr[i];
            }
        }
        System.out.println(secMAx);
    }
}
