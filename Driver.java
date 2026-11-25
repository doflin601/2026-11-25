package pto2.sec02;

public class Driver {
    public void Drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle;
            vehicle.run();
            bus.CheckFare();
        } else if (vehicle instanceof Taxi) {
            vehicle.run();
            System.out.println("택시 요금을 지불합니다.");
        } else {
            System.out.println("잘못된 변환입니다.");
        }
    }
}
