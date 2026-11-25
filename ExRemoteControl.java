package pto2.sec00;

public class ExRemoteControl {
    RemoteControl rc = new Television();

    ExRemoteControl() {

    }

    public ExRemoteControl(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(5);
    }
}
