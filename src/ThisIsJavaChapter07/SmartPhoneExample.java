package thisIsJavaChapter07;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시22플러스", "화이트", "삼성인터넷");

        System.out.println("모델: " + smartPhone.model);
        System.out.println("컬러: " + smartPhone.color);

        System.out.println("어플:" + smartPhone.App);

        smartPhone.turnOnApp();

        smartPhone.powerOn();
        smartPhone.sendVoice("여보세요?");
        smartPhone.receiveVoice("어 나야");
        smartPhone.sendVoice("나 바빠 좀이따 전화줄게");
        smartPhone.hangUp();

        smartPhone.turnOnApp();
        smartPhone.ChangeApp("유튜브 뮤직");
        System.out.println("9"+7+5);
        System.out.println(9+"9"+9);
    }
}
