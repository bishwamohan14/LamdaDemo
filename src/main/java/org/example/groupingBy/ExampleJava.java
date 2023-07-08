package org.example.groupingBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleJava {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Jaga",10000);
        Employee e2 = new Employee(2,"ashish",9000);
        Employee e3= new Employee(2,"sudha",11000);
        Employee e4= new Employee(2,"sushree",13000);
        Employee e5= new Employee(2,"ashutosh",17000);
        Employee e6= new Employee(2,"radha",10000);
        Employee e7= new Employee(2,"aja",12000);
        Employee e8= new Employee(2,"ram",13000);
        Employee e9= new Employee(2,"gopal",10000);
        Employee e10= new Employee(2,"hari",15000);

        List<Employee> employees=new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

//        Map<Long, List<Employee>> collect = employees.stream()
//                .collect(Collectors.groupingBy(employee -> employee.getSalary()));
//        System.out.println(collect);
//
//        List<Map.Entry<Long, List<Employee>>> collect1 = collect.entrySet()
//                .stream().sorted((a, b) -> b.getKey().compareTo(a.getKey())).collect(Collectors.toList());
//        System.out.println(collect1);


        List<Map.Entry<Long, List<String>>> collect = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getSalary(), Collectors.mapping(s -> s.getName(), Collectors.toList())))
                .entrySet().stream().sorted((a, b) -> Math.toIntExact((b.getKey()) - (a.getKey())))
                .collect(Collectors.toList());

        System.out.println(collect);

        // fetch top 3 salaries



        List<Map.Entry<Long, List<String>>> collect1 =  collect.stream().limit(3).collect(Collectors.toList());
        System.out.println(collect1);

        // fetch all employees having salary less than 3rd highest salary

        List<Map.Entry<Long, List<String>>> collect2 = collect.stream().skip(3).collect(Collectors.toList());
        System.out.println(collect2);

        // all salaries having salary less than 3rd highest salary



    }

}
