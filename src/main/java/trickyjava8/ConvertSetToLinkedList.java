package trickyjava8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ConvertSetToLinkedList {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        LinkedList<Integer> linkedList = set.stream().collect(Collectors.toCollection(LinkedList::new));
    }
}
