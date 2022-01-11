package ThisIsJavaChapter07;

public abstract class AbstractPhone {
    public String Owner;

    public AbstractPhone(String Owner) {
        this.Owner = Owner;
    }

    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

}
