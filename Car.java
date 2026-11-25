package pto2.sec01;

public class Car {
    Tire Front_Left_Tire = new HanKookTrie();
    Tire Front_Right_Tire = new HanKookTrie();
    Tire Back_Left_Tire = new HanKookTrie();
    Tire Back_Right_Tire = new HanKookTrie();

    void run() {
        Front_Left_Tire.roll();
        Front_Right_Tire.roll();
        Back_Left_Tire.roll();
        Back_Right_Tire.roll();
    }
}
