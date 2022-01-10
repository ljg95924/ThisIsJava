package ThisIsJavaChapter07;

public class SuperExample {
    public static void main(String[] args) {
        SuperChild child = new SuperChild("아이유","930516-1234567",1);
        child.OutputName();
        child.OutputSsn();
        child.OutputStudentNo();
    }
}
