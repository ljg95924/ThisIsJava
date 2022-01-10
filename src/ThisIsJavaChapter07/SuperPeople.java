package ThisIsJavaChapter07;

public class SuperPeople {
    private String name;
    private String ssn;

    public SuperPeople(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void OutputName() {
        System.out.println("이름은 " + name);
    }

    public void OutputSsn() {
        System.out.println("주민번호는 " + ssn);
    }
}
