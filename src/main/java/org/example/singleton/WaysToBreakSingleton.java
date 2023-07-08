package org.example.singleton;

public class WaysToBreakSingleton {
    public static void main(String[] args) throws ClassNotFoundException {
        Singleton originalSingletonInstance = Singleton.getInstance();
        Singleton duplicateSingletonInstance = Singleton.getInstance();
        System.out.println("Hashcode for originalSingletonInstance :"+originalSingletonInstance.hashCode());
        System.out.println("Hashcode for duplicateSingletonInstance :"+duplicateSingletonInstance.hashCode());

        //Ways to break singleton
        // 1. Reflection
        //2. Serialization
        //3.Cloning

        // Clone method to break singleton

    }
}
