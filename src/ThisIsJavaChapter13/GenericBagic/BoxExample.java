package ThisIsJavaChapter13.GenericBagic;

public class BoxExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>();
        box1.setT("hello");
        System.out.println(box1.getT());

        Box<Integer> box2 = new Box<Integer>();
        box2.setT(1234);
        System.out.println(box2.getT());
    }
}
