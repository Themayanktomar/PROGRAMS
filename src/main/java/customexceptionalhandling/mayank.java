package customexceptionalhandling;

import java.util.ArrayList;

public class mayank {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(78);
        list.add(56);

        System.out.println(list);
        Integer removeal_num = 100;

        list.remove(removeal_num);

        System.out.println(list);

    }
}
