package thisIsJavaChapter07;

public class CastingChildExample {
    public static void main(String[] args) {
        CastingParent parent = new CastingChild();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        CastingChild child = (CastingChild) parent;
        child.field2 = "EZ";
        child.method3();

    }
}
