package org.example.Map;

import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedMapVsConcurrentHashMap {
        public static void main(String[] args) {
            Map<String,String> map1=new HashMap<>();
            map1.put("1","Naveen");
            map1.put("2","Tom");
            map1.put("3","Lisa");

            // create synchronized Map
            Map<String, String> synchronizedMap = Collections.synchronizedMap(map1);
            System.out.println(synchronizedMap);

            // concurrent map

            ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
            concurrentHashMap.put("A","Java");
            concurrentHashMap.put("B","Python");
            concurrentHashMap.put("C","Ruby");
            System.out.println(concurrentHashMap.get("A"));


        }
}
