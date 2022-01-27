package ThisIsJavaChapter13.GenericMethod;

import ThisIsJavaChapter13.GenericBagic.Box;

public class BoxingMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        System.out.println(box1.getT());

        Box<String> box2 = Util.boxing("홍길동");
        System.out.println(box2.getT());

    }
}
