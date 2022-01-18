package ThisIsJavaChapter11.ToString;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        System.out.println(myPhone.toString());

        //myPhone.toString()을 자동호출해서 리턴값을 얻은 후 출력
        System.out.println(myPhone);
    }
}
