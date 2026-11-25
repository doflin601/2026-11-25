package pto2.sec00;

public class ExecuteSec00 {
    static void main(String[] args) {
        System.out.println("1)-------------------");
        ExRemoteControl exRemoteControl = new ExRemoteControl();
        exRemoteControl.rc.turnOn();
        exRemoteControl.rc.setVolume(1);

        System.out.println("2)-------------------");
        ExRemoteControl exRemoteControl2 = new ExRemoteControl(new Audio());

        System.out.println("3)-------------------");
        ExRemoteControl exRemoteControl3 = new ExRemoteControl();
        exRemoteControl3.methodA();

        System.out.println("4)-------------------");
        ExRemoteControl exRemoteControl4 = new ExRemoteControl();
        exRemoteControl4.methodB(new Television());
    }
}
