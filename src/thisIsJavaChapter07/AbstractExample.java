package thisIsJavaChapter07;

public class AbstractExample {
    public static void main(String[] args) {
        AbstractSmartPhone smartPhone = new AbstractSmartPhone("아이유");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
