package org.example.CopyConstructor;

public class A {
    int a;
    String b;
    A(){
        a=10;
        b="copyConstructor";
        System.out.println(a+" "+b);
    }
    A(A ref){
        int a = ref.a;
        String b = ref.b;
        System.out.println(a+" "+b);
    }
}

class B{
    public static void main(String[] args) {
        A r = new A();
        A r2=new A(r);
    }
}
