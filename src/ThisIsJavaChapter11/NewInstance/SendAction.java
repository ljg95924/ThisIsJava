package ThisIsJavaChapter11.NewInstance;

public class SendAction implements Action{

    @Override
    public void execute() {
        System.out.println("데이터를 보냅니다.");
    }
}