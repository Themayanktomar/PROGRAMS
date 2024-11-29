package prepinsta.arrays;

import java.util.Collections;

public class Test {

    public static void main(String[] args) {
    Emp emp = new Emp(90 , "mayank");
        System.out.println(emp.age);

        Emp emp1 = new Emp(23 , "joney");
        emp = emp1;
        emp.age = 30;

        System.out.println(emp.age);
    }
}
