package ThisIsJavaChapter07;

public class AbstractSmartPhone extends AbstractPhone {
    public AbstractSmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
