package customexceptionalhandling;

public class DekhleBhai {
    int x = 10;

    public void modifyPrimitive(int num) {
        num = 99;
    }

    public void modifyObject(DekhleBhai obj) {
        obj.x = 99;
    }
}

class Test23 {
    public static void main(String[] args) {
        DekhleBhai dekhleBhai = new DekhleBhai();

        System.out.println("Original value of x: " + dekhleBhai.x);  // Output: 10

        int primitiveValue = 50;
        dekhleBhai.modifyPrimitive(50);
        System.out.println("After modifyPrimitive, primitiveValue: " + primitiveValue);

        dekhleBhai.modifyObject(dekhleBhai);
        System.out.println("After modifyObject, value of x: " + dekhleBhai.x);
    }
}
