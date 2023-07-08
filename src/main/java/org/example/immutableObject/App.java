package org.example.immutableObject;

public class App {
    public static void main(String[] args) {
        Address homeAddress = new Address("BBSR","Odisha","India");
        Student abhilash =new Student(1, "Abhilash Panigraghi ",homeAddress);
        System.out.println(abhilash);

        Address address = abhilash.getAddress();
        address.setCityName("Blr");
        address.setState("Karnataka");

        System.out.println(abhilash);
    }
}
