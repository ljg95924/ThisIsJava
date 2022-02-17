package thisIsJavaChapter08;

public interface DefaultMyInterface {
    public void method1();

    public default void method2() {
        System.out.println("MyInterface-method2 실행");
    }
}
