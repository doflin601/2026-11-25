package pto2.sec02;

public class ExecuteVehicle {
    static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        driver.Drive(taxi);
        System.out.println("-----------------------");
        driver.Drive(bus);
    }
}
