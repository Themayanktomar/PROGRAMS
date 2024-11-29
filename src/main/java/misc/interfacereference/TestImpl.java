package misc.interfacereference;

public class TestImpl implements TestInterface{

    void add(int a  , int b)
    {
        System.out.println(a+b);
    }
}

class Main{



    public static void main(String[] args) {

        TestImpl test = new TestImpl();
//        test.

    }
}
