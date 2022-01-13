package ThisIsJavaChapter08;

public class DefaultMethodExample {
    public static void main(String[] args) {
        DefaultMyInterface DMI = new DefaultMyClassA();
        DMI.method1();
        DMI.method2();

        DMI = new DefaultMyClassB();
        DMI.method1();
        DMI.method2();
    }
}
