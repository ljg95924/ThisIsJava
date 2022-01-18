package ThisIsJavaChapter11.Clone;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("blue", "홍길동", "12345", 25, true);

        //복제 객체를 얻은 후 패스워드 변경
        Member cloned = original.getMember();
        cloned.password = "67890";

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id " + cloned.id);
        System.out.println("pass " + cloned.password);
        System.out.println(cloned.age);
        System.out.println(cloned.adult);

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id " + original.id);
        System.out.println("pass " + original.password);
        System.out.println(original.age);
        System.out.println(original.adult);
    }
}
