package thisIsJavaChapter07;

public class SmartPhone extends CellPhone {
    String App;

    SmartPhone(String model, String color, String app) {
        this.model = model;
        this.color = color;
        this.App = app;
    }

    void turnOnApp() {
        System.out.println("실행할 어플:" + App + "입니다.");
    }

    void ChangeApp(String App) {
        this.App = App;
        System.out.println("다른 어플 " + App + " 실행합니다.");
    }
}
