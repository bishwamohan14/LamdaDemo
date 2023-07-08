package org.example.FactoryDesign;

public class Main {
    public static void main(String[] args) {
        ProfessionFactory professionFactory=new ProfessionFactory();
        Profession doctor = professionFactory.getProfession("doctor");
        doctor.print();

    }
}
