package ThisIsJavaChapter09.AnoymousInterfaceObject;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        //익명객체 필드사용
        anonymous.field.turnOn();
        //익명객체 로컬변수사용
        anonymous.method1();
        //익명객체 매개값 사용
        anonymous.method2(
                new RemoteControl() {

                    @Override
                    public void turnOn() {
                        System.out.println("스마트TV를 켭니다.");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("스마트TV를 끕니다.");
                    }
                }
        );
    }
}
