package thisIsJavaChapter11.charAt;

public class StringChatAtExample {
    public static void main(String[] args) {
        String ssn = "950924-1234567";
        char sex = ssn.charAt(7);
        if (sex == '1' || sex == '3') {
            System.out.println("남자");
        } else if (sex == '2' || sex == '4') {
            System.out.println("여자");
        }
    }
}
