package ThisIsJavaChapter11.ToString;

public class SmartPhone {

    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "company='" + company + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
