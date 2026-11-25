package pto2.sec03;

public class Execute {
    static void main(String[] args) {
        ImplementationC impl = new ImplementationC();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println("----------------------------------------------");
        InterfaceB ia2 = impl;
        ia2.methodB();
        System.out.println("----------------------------------------------");
        impl.methodA();
        impl.methodB();
        impl.methodC();
    }
}
