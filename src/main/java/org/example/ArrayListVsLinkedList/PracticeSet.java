package org.example.ArrayListVsLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class PracticeSet {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList=new LinkedList<>();
        namesLinkedList.add("Jaga");
        namesLinkedList.add("john");
        namesLinkedList.add("paul");
        namesLinkedList.add("george");

        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1,"Jerry");

        ArrayList<String> namesArrayList=new ArrayList<>();
        namesArrayList.add("Jaga");
        namesArrayList.add("john");
        namesArrayList.add("paul");
        namesArrayList.add("george");
        namesArrayList.add(1,"Jerry");

        System.out.println(namesArrayList.get(2));


    }
}
