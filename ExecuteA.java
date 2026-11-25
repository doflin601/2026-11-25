package pto2.sec05;

public class ExecuteA {
    static void main(String[] args) {
        A a = new A();

        // 인스턴스 멤버 클래스 객체 생성
        A.B b = a.new B();
        b.field1 = 1;
        b.method1();

        // 정적 멤버 클래스 객체 생성
        A.C c = new A.C();
        c.field1 = 2;
        A.C.field2 = 3; // field2는 static field
        c.method1();
        A.C.method2(); // method2는 static method

        // 로컬 클래스 객체 생성
        a.method();
    }
}
