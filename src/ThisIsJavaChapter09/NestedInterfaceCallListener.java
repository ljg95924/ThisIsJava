package thisIsJavaChapter09;

public class NestedInterfaceCallListener implements NestedInterfaceButton.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
