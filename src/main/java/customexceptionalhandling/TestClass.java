package customexceptionalhandling;

public class TestClass {


   public static void show()throws CustomCheckedException
   {
       System.out.println("showing");
   }

    public static void main(String[] args) throws CustomCheckedException {

       TestClass.show();
    }

}
