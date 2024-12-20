package prepinsta.strings;

public class FirstNonRepeatedCharacter {


    public static void main(String[] args) {

        String string = "mayank";

        for (int i = 0 ; i< string.length() ; i++)
        {
            if (string.indexOf(i) == string.lastIndexOf(i))
            {
                System.out.println(string.charAt(i));
                break;
            }
        }
    }
}
