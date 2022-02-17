package thisIsJavaChapter07;

public class CellPhone {
    String model;
    String color;

    void powerOn() {
        System.out.println("Power On");
    }

    void powerOff() {
        System.out.println("Power Off");
    }

    void sendVoice(String message) {
        System.out.println("나의: " + message);
    }

    void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    void hangUp() {
        System.out.println("통화 종료");
    }
}
