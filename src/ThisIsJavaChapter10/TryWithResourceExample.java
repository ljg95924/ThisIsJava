package thisIsJavaChapter10;

public class TryWithResourceExample {
    public static void main(String[] args) {
        try (TryWithResourceFileInputStream fileInputStream = new TryWithResourceFileInputStream("file.txt")) {
            fileInputStream.read();

            //강제적으로 예외 발생시킴
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외처리코드 실행");
        }
    }
}
