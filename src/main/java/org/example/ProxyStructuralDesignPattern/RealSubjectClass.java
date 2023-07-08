package org.example.ProxyStructuralDesignPattern;

public class RealSubjectClass  implements  Subject{
    @Override
    public void method() {
        System.out.println("I Am an actual implementation of subject,rest all are proxies");
    }
}
