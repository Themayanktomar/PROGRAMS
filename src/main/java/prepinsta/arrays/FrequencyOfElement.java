package prepinsta.arrays;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElement {

    private static void findFrequencyOFEachElement(int[] arr)
    {
        Map<Integer , Integer> frequencyMap = new HashMap<>();
        int frequency = 0;
        for (int i  = 0 ; i<arr.length ; i++)
        {
            for (int j = 0 ; j< arr.length ; j++)
            {
                if (arr[i] == arr[j])
                {
                    frequency++;
                }
            }
            frequencyMap.put(arr[i] , frequency);
            frequency = 0;
        }

        for (Map.Entry<Integer , Integer> entry : frequencyMap.entrySet())
        {
            if (entry.getValue()%2 !=0)
            {
                System.out.println(entry.getKey() + " Comes Odd number of times");
            }
        }
        System.out.println(frequencyMap);
    }



    public static void main(String[] args) {

        findFrequencyOFEachElement(new int[]{10,10,10,20,20});
    }
}
