package org.example.mock1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MockTest {
    // reverse string using java 8 stream,reverse
    public static void main(String[] args) {
        // Java 8 program to find second highest number from given array
        //Q: Java 8 program to find second highest number from given array

        Integer [] numbers={5,8,0,9,10,4,5,5,5,10,9,9};
        List<Integer> collect = Arrays.stream(numbers).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer> reverseOrder = collect.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
        System.out.println(reverseOrder);
        Set<Integer> collect1 = reverseOrder.stream().collect(Collectors.toSet());
        System.out.println(collect1);
        Integer secondHighest = collect1.stream().sorted((x, y) -> y - x).skip(1).findFirst().get();
        System.out.println("Second highest: "+secondHighest);


    }

}
