package org.example.practiceQuestions;

import org.example.groupingBy.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeJava {
    public static void main(String[] args) {

        //Q>1 Given a list of integers, find out all the even numbers that exist in the list using Stream functions?


//        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
//        System.out.println("List of integers");
//        List<Integer> evenList = list.stream().filter(integer -> integer % 2 == 0).collect(Collectors.toList());
//        System.out.println(evenList);
//        System.out.println("only integers");
//        list.stream().filter(integer -> integer%2==0).forEach(System.out::println);


//        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
//        myList.stream()
//                .map(s -> s +"")
//                .filter(s -> s.startsWith("1"))
//                .forEach(System.out::println);

       //3. How to find duplicate elements in a given integers list in java using Stream functions?

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        Set<Integer> set = new HashSet<>();
//        myList.stream()
//                .filter(s-> !set.add(s))
//                .forEach(System.out::println);

        //4. Given the list of integers, find the first element of the list using Stream functions?

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList.stream().findFirst().ifPresentOrElse(System.out::println,()-> System.out.println("Not found"));

        //5. Given a list of integers, find the total number of elements present in the list using Stream functions?

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        long count = myList.stream().count();
//        System.out.println("count : "+count);

        //






//        Set<Long> longs=new HashSet<>();
//        long count1 = myList.stream().filter(integer -> longs.add(Long.valueOf(integer))).count();
//        System.out.println("counting without duplicates: "+count1);


      //6. Given a list of integers, find the maximum value element present in it using Stream functions?

//           List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//            Integer integer = myList.stream().max(Integer::compareTo).get();
//             System.out.println(integer);

//        Integer integer = myList.stream().max(Integer::compare).get();
//        System.out.println(integer);

//        Integer max = myList.stream().max(Integer::compareTo).get();
//        System.out.println("Maximum using method 1: "+max);
//
//        Integer integer = myList.stream().sorted(Comparator.<Integer>reverseOrder()).findFirst().get();
//        System.out.println("Maximum using method 2: "+integer);
//
//        Integer integer1 = myList.stream().collect(Collectors.reducing(Integer::max)).get();
//        System.out.println(integer1);

        //7. Given a String, find the first non-repeated character in it using Stream functions?

//-----------------------------------JAVA TECHIE------------------------------------------------------

        // JAva Techie> Q1>Java program to count the occurrence of each character in a string

//        String input="ilovejavatechie";
//        String[] split = input.split("");
//        Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(collect);

        //Q2>Java program to find all duplicate element from string

//        String input="ilovejavatechie";
//        String[] split = input.split("");
//        Map<String, Long> collect = Arrays.stream(split).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//        System.out.println(collect);
//        List<Map.Entry<String, Long>> collect1 = Arrays.stream(split).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet().stream().filter(s -> s.getValue() > 1).collect(Collectors.toList());
//        System.out.println(collect1);
//        //only elements
//
//        List<String> collect2 = Arrays.stream(split).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet().stream().filter(s -> s.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        System.out.println(collect2);
//
//        // unique element with occurrence
//
//        List<Map.Entry<String, Long>> collect3 = Arrays.stream(split).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet().stream().filter(s -> s.getValue() == 1)
//                .collect(Collectors.toList());
//        System.out.println(collect3);
//
//        List<String> collect4 = Arrays.stream(split).collect(Collectors.groupingBy(s -> s, Collectors.counting()))
//                .entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue() == 1)
//                .map(Map.Entry::getKey).collect(Collectors.toList());
//
//        System.out.println(collect4);

        //Q3> Java program to find first non repeat element from a string

//        String input="ilovejavatechie";
//        String[] split = input.split("");
//        String key = Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() == 1)
//                .findFirst().get().getKey();
//        System.out.println(key);


        //Q>4 Java program to find the  second highest number from an array.

//        int[] numbers={5,9,11,2,8,21,1};
//        Integer secondHighest = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
//        System.out.println(secondHighest);

        //second lowest
//        Integer secondLowest = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
//        System.out.println(secondLowest);

        //Q>5 Java program to find longest string from given array.

//        String[] strArray={"java","techie","springboot","microservices"};
//
//        String longestString = Arrays.stream(strArray).reduce((e1, e2) -> e1.length() > e2.length() ? e1 : e2).get();
//        System.out.println(longestString);


        //Q>6 Java program to find all elements from array who starts with 1

//        int[] numbers={5,9,11,2,8,21,1};
//        List<String> collect = Arrays.stream(numbers).boxed()
//                .map(s -> s + "")
//                .filter(s -> s.startsWith("1"))
//                .collect(Collectors.toList());
//        System.out.println(collect);

        //Q>7 String.join method

//        List<String> numbers = Arrays.asList("1", "2", "3", "4");
//        String results = String.join("-", numbers);
//        System.out.println(results);


        //Q> Skip and limit method use case based example

//        IntStream.rangeClosed(1,10).skip(1).limit(8).forEach(System.out::println);

//        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
////
//
//        List<Integer> collect = list.stream().skip(1).limit(2).collect(Collectors.toList());
//        System.out.println(collect);


        Student s1=new Student(1,"rajani",25,new int[]{90,80,85,77});
        Student s2=new Student(2,"srikant",25,new int[]{90,80,85,77});
        Student s3=new Student(3,"basant",27,new int[]{90,80,85,77});
        Student s4=new Student(4,"sai",28,new int[]{90,80,85,77});
        Student s5=new Student(5,"sanat",28,new int[]{90,80,85,77});
        Student s6=new Student(6,"sunil",30,new int[]{90,80,85,77});
        Student s7=new Student(7,"deepak",31,new int[]{90,80,85,77});
        Student s8=new Student(8,"ravi",32,new int[]{90,80,85,77});
        Student s9=new Student(9,"ravi",32,new int[]{90,80,85,77});
        Student s10=new Student(10,"ravi",32,new int[]{90,80,85,77});
        Student s11=new Student(11,"ravi",32,new int[]{90,80,85,77});
        Student s12=new Student(12,"ravi",32,new int[]{90,80,85,77});
        Student s13=new Student(13,"",25,new int[]{10,11,12,13});

        List<Student> a1=new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);
        a1.add(s6);
        a1.add(s7);
        a1.add(s8);
        a1.add(s9);
        a1.add(s10);
        a1.add(s11);
        a1.add(s12);

//        List<String> nameList = a1.stream().map(student -> student.getName()).sorted().collect(Collectors.toList());
//        System.out.println(nameList);
//        String collect = nameList.stream().map(s -> s.toUpperCase()).collect(Collectors.joining("-"));
//        System.out.println(collect);


        // fetch duplicate names
//
//        List<String> namesInRepo = a1.stream().map(student -> student.getName()).collect(Collectors.toList());
//        Set<String>uniqueNames=new HashSet<>();
//        List<String> duplicateNames = namesInRepo.stream().filter(s -> !uniqueNames.add(s)).collect(Collectors.toList());
//        System.out.println(uniqueNames);


        //************************     Type 1 ****************************************************
//        List<String> names = a1.stream().map(student -> student.getName()).collect(Collectors.toList());
//        Set<String> uniqueNames=new HashSet<>();
//        List<String> duplicateNames = names.stream().filter(s -> !uniqueNames.add(s)).collect(Collectors.toList());
//        System.out.println("Names in List: "+names);
//        System.out.println("-----------------------------------------------");
//        System.out.println("Unique Names: "+uniqueNames);
//        System.out.println("-------------------------------------------------");
//        System.out.println("duplicate names: "+duplicateNames);
        //*********************** Type 2 ********************************************

//        List<String> names = a1.stream().map(student -> student.getName()).collect(Collectors.toList());
//        Map<String, Long> mapOfNames = names.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//        System.out.println(mapOfNames);
//        List<String> duplicateName = mapOfNames.entrySet().stream().filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(duplicateName);



        // *****************************Type 3 winding up previous method**************************
/*
        List<String> names = a1.stream().map(student -> student.getName()).collect(Collectors.toList());
        System.out.println("names: "+names);
        Map<String, Long> namesWithCounting = names.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("namesWithCounting: "+namesWithCounting);
        List<Map.Entry<String, Long>> namesOfOnlyDuplicatesWithCounting = namesWithCounting.entrySet().stream().filter(s -> s.getValue() > 1).collect(Collectors.toList());
        System.out.println("namesOfOnlyDuplicatesWithCounting: "+namesOfOnlyDuplicatesWithCounting);
        List<String> onlyKeyvalue = namesOfOnlyDuplicatesWithCounting.stream().map(stringLongEntry -> stringLongEntry.getKey()).collect(Collectors.toList());
        System.out.println("onlyKeyvalue:  "+onlyKeyvalue);

*/



    }
}
