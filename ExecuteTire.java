package pto2.sec01;

public class ExecuteTire {
    static void main(String[] args) {
        Car car = new Car();
        car.run();

        car.Front_Left_Tire = new KumhoTire();
        car.Front_Right_Tire = new KumhoTire();
        System.out.println("--------------------------");
        car.run();
    }

}
