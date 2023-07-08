package org.example.practiceQuestions;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Myntra {
    public static void main(String[] args) {
        Map<String,Integer> map1 =new HashMap<>();
        map1.put("anil",1000);
        map1.put("bhavna",1300);
        map1.put("michale",1700);
        map1.put("tom",1600);
        map1.put("ankit",1200);
        map1.put("daniel",1700);
        map1.put("james",1700);

//        System.out.println(Myntra.nthHighestSalary(1,map1));

        System.out.println( Myntra.nthHighest(1,map1));

    }

        public static  List<String> nthHighest(Integer num,Map<String,Integer> map1){
            Map.Entry<Integer, List<String>> integerListEntry = map1.entrySet()
                    .stream()
                    .collect(Collectors.groupingBy(s -> s.getValue(), Collectors.mapping(s -> s.getKey(), Collectors.toList()))).entrySet()
                    .stream().sorted((a, b) -> b.getKey().compareTo(a.getKey())).collect(Collectors.toList()).get(num-1);
                return integerListEntry.getValue();
        }
}
