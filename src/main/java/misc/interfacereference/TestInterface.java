package misc.interfacereference;

public interface TestInterface {


   default void show()
    {
        System.out.println("this is a method of interface");
    }
}
