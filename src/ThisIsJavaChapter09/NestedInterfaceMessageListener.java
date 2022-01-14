package ThisIsJavaChapter09;

public class NestedInterfaceMessageListener implements NestedInterfaceButton.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("메시지를 보냅니다.");
    }
}
