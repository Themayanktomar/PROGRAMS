package prepinsta.strings;

import java.util.HashMap;

public class DuplicateCharCount {

    public static void main(String[] args) {

        String string = "mayank";
        HashMap<String , Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i  = 0 ; i<string.length() ; i++)
        {
            for (int j  = 0 ; j<string.length() ; j++)
            {
                if (string.charAt(i) == string.charAt(j))
                {
                    count++;
                }
            }

            if (count > 1)
            {
                hashMap.put(String.valueOf(string.charAt(i)), count);

            }
            count = 0;
        }

        System.out.println(hashMap);
    }
}
