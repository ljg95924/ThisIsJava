package thisIsJavaChapter15.vector;

public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public String getSubject() {
        return subject;
    }

    public String getWriter() {
        return writer;
    }
}
