package pto2.sec05;

public class A {
    A() {
        System.out.println("A 객체가 생성됨.");
    }

    // 인스턴스 멤버 클래스
    public class B{
        int field1;
        //static int field2; // java17 이상부터 허용
        B() {
            System.out.println("B 객체가 생성됨.");
        }
        void method1() {

        }
        // java17 이상부터 허용
        //static void method2() {}
    }

    // 정적 멤버 클래스 (static class)
    static class C {
        int field;
        static int field2; // static class에선 static field 자바 버전 상관없이 허용
        C() {
            System.out.println("C 객체가 생성됨.");
        }

        void method1() {}
        static void method2() {} // static class에선 static method 자바 버전 상관없이 허용
    }

    void method() {
        // local class (메소드 안에 존재하는 클래스)
        class D {
            int field1;
            D() {
                System.out.println("D 객체가 생성됨.");
            }
            void method1() {

            }
            //static void method2() {} java17 이상부터 허용
        }
        D d= new D();
        d.field1 = 3;
        d.method1();
    }
}
