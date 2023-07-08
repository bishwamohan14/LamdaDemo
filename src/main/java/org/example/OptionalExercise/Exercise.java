package org.example.OptionalExercise;

import java.util.Optional;

public class Exercise {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("fred");
        Integer catAge = optionalCat.map(cat -> cat.getAge()).orElse(0);
        System.out.println(catAge);

//        Integer age = optionalCat.map(Cat::getAge).orElse(0);
//        System.out.println(age);


//        Cat cat = optionalCat.orElse(new Cat("Unknown", 0));
//        System.out.println(cat);

//        if (optionalCat.isPresent()){
//            System.out.println(optionalCat.get().getAge());
//        }
//        else {
//            System.out.println(0);
//        }


    }
    private static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name,3);
        return Optional.ofNullable(cat);
    }
}
