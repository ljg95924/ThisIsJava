package ThisIsJavaChapter09;

public class NestedInterfaceButtonExample {
    public static void main(String[] args) {
        NestedInterfaceButton button = new NestedInterfaceButton();

        button.setOnClickListener(new NestedInterfaceCallListener());
        button.touch();

        button.setOnClickListener(new NestedInterfaceMessageListener());
        button.touch();
    }
}
