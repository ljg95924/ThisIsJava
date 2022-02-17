package thisIsJavaChapter14.noParameterNoReturnValue;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = () -> {
            String str = "method call1";
            System.out.println(str);
        };
        fi.method();

        fi = () -> System.out.println("method call2");
        fi.method();
    }
}
