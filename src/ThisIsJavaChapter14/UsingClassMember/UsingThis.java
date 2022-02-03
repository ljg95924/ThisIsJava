package ThisIsJavaChapter14.UsingClassMember;

public class UsingThis {
    public int outterField = 10;

    class Inner {
        int innnerField = 20;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outter: " + outterField);
                System.out.println("outter: " + UsingThis.this.outterField);

                System.out.println("inner: " + innnerField);
                System.out.println("inner: " + this.innnerField);
            };
            fi.method();
        }
    }
}
