package prepinsta.strings;

public class Test {
    public static void main(String[] args)
    {
        String s   = "mAyank";
        String ss = "";
        for(int i  = 0 ; i<s.length() ; i++)
        {

            if(i%2==0)
            {
                String temp = String.valueOf(s.charAt(i)).toUpperCase();
                ss = ss + temp;

            }else {
                ss = ss + s.charAt(i);
            }


        }
        System.out.println(ss);
    }
}
