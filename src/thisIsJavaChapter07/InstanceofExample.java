package thisIsJavaChapter07;

public class InstanceofExample {
    public static void method1(InstanceofParent parent) {
        if (parent instanceof InstanceofChild) {
            InstanceofChild child = (InstanceofChild) parent;
            System.out.println("method1 - Child로 변환 성공");
        } else {
            System.out.println("method1 - Child로 변환 실패, 그대로 진행했으면 ClassCastException 발생");
        }
    }

    public static void main(String[] args) {
        InstanceofParent parentA = new InstanceofChild();
        method1(parentA);

        InstanceofParent parentB = new InstanceofParent();
        method1(parentB);
    }
}
