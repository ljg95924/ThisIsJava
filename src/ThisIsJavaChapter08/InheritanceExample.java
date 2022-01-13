package ThisIsJavaChapter08;

public class InheritanceExample {
    public static void main(String[] args) {
        InheritanceImplementationC impl = new InheritanceImplementationC();

        InheritanceInterfaceA ia = impl;
        ia.methodA();
        System.out.println();

        InheritanceInterfaceB ib = impl;
        ib.methodB();
        System.out.println();

        InheritanceInterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
