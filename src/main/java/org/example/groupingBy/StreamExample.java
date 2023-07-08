package org.example.groupingBy;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        Student s1=new Student(1,"rajani",25,new int[]{90,80,85,77});
        Student s2=new Student(2,"srikant",25,new int[]{90,80,85,77});
        Student s3=new Student(3,"basant",27,new int[]{90,80,85,77});
        Student s4=new Student(4,"sai",28,new int[]{90,80,85,77});
        Student s5=new Student(5,"sanat",28,new int[]{90,80,85,77});
        Student s6=new Student(6,"sunil",30,new int[]{90,80,85,77});
        Student s7=new Student(7,"deepak",31,new int[]{90,80,85,77});
        Student s8=new Student(8,"ravi",32,new int[]{90,80,85,77});

        List<Student> a1=new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);
        a1.add(s6);
        a1.add(s7);
        a1.add(s8);

        Map<Integer, List<Student>> groupByAge = a1.stream().collect(Collectors.groupingBy(student -> student.getAge()));
        System.out.println(groupByAge);

        Map<Integer, Set<Student>> groupBySet = a1.stream().collect(Collectors.groupingBy(student -> student.getAge(), Collectors.toSet()));
        System.out.println(groupBySet);

        Map<Integer, List<String>> groupByAgeList = a1.stream().collect(Collectors.groupingBy(student -> student.getAge(), Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(groupByAgeList);

        Hashtable<Integer, List<String>> groupByAgeList1 = a1.stream()
                .collect(Collectors.groupingBy(student -> student.getAge(), Hashtable::new, Collectors.mapping(student -> student.getName(), Collectors.toList())));
        System.out.println(groupByAgeList1);
    }
}
