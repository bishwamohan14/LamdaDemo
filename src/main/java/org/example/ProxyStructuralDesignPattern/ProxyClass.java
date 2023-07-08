package org.example.ProxyStructuralDesignPattern;

public class ProxyClass extends RealSubjectClass{
    @Override
    public void method() {
        System.out.println("Hi I am proxy,I will perform authentication and security checks");
        super.method();
    }
}
