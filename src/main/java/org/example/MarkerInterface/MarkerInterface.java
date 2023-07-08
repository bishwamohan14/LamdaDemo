package org.example.MarkerInterface;

public class MarkerInterface {
    public static void main(String[] args) {
        Civic car = new Civic();
        if(car instanceof Hatchback){
            System.out.println(" this is a hatchBack car!!!");
        }else {
            System.out.println("this is a hatchBack car!!");
        }
    }
}

interface Hatchback{

}

class Civic{


}

class Jazz implements Hatchback{

}
