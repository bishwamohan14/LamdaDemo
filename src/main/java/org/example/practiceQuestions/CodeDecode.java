package org.example.practiceQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CodeDecode {
    public static void main(String[] args) {

        //https://www.youtube.com/watch?v=RynqGUbgw9k&list=PLyHJZXNdCXsfcMboYwGoL6wKAFPxljz5W&index=8

        // Q>1 Given an array of integers use java 8 to find the smallest element
//        int[] numbers={5,4,3,2,1,1,1};
//        CodeDecode.fetchSecondSmallestNumber(numbers);


        //Q>2 Given two arrays of integers, write a java  program to find common elements between them.

//        int[] array1={1,2,3,4,5};
//        int[] array2={4,5,6,7,8};
//
//        CodeDecode.commonElements(array1,array2);

        //Q>3 Write a java 8 program to reverse an array of Integers in-place

//        int[] numbers={1,2,3,4,5};
//
//        List<Integer> sortedInAscending = Arrays.stream(numbers).sorted().boxed().collect(Collectors.toList());
//        List<Integer> sortedInDescendingOrder = sortedInAscending.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
//        System.out.println(sortedInAscending);
//        System.out.println(sortedInDescendingOrder);
//
//        String collect = sortedInDescendingOrder.stream().map(s -> s + "").collect(Collectors.joining("-"));
//        System.out.println(collect);

        // other way to reverse an array...


        //Q>4 Given an array for strings,write a  java program to find the length of longest string.

        String[] strings={"Apple","Banana","Avocado","Apricot","Grapes"};
//        int maxLengthOfString = Arrays.stream(strings).mapToInt(string -> string.length()).max().orElse(0);
//        System.out.println(maxLengthOfString);



        List<Integer> integersOfStrings = Arrays.stream(strings).mapToInt(s -> s.length()).boxed().collect(Collectors.toList());
        System.out.println(integersOfStrings);



    }

    public static void fetchSecondSmallestNumber(int[] numbers){
        int secondSmallest = Arrays.stream(numbers).distinct().sorted() //.distinct() -- avoid duplicates
                .skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Not found"));
        System.out.println("second Smallest: "+secondSmallest);
    }

    public static void commonElements(int[] array1,int[] array2){
        List<Integer> commonElements = Arrays.stream(array1)
                .filter(num -> Arrays.stream(array2).anyMatch(arr2 -> arr2 == num)).boxed().collect(Collectors.toList());
        System.out.println("Common elements: "+commonElements);
    }

}