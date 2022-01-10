package ThisIsJavaChapter07;

public class SuperChild extends SuperPeople {
    private int studentNo;

    public SuperChild(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
    }

    public void OutputStudentNo() {
        System.out.println("학생번호는 " + studentNo);
    }
}
