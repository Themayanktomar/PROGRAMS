package prepinsta.arrays;

import java.util.*;

public class SortElementsByFrequency {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 4, 3, 3, 5};

        // Step 1: Create a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert array to list for sorting
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Step 3: Sort list based on frequency and value
        list.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b) - frequencyMap.get(a);
            return freqCompare != 0 ? freqCompare : a - b;
        });

        // Step 4: Convert sorted list back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }




        // Print the sorted array
        System.out.println("Array sorted by frequency: " + Arrays.toString(arr));
    }
}
