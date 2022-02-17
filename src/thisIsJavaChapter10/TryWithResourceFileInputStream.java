package thisIsJavaChapter10;

public class TryWithResourceFileInputStream implements AutoCloseable {
    private String file;

    public TryWithResourceFileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + "을 읽습니다.");
    }

    @Override
    public void close() throws Exception {
        System.out.println(file + "을 닫습니다.");
    }
}
