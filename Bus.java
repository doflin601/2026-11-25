package pto2.sec02;

public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus가 달립니다.");
    }
    public void CheckFare() {
        System.out.println("승차 요금을 확인합니다.");
    }
}
