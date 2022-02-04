package ThisIsJavaChapter15.Hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("spring", "505");
        map.put("summer", "711");
        map.put("fall", "924");
        map.put("winter", "124");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("아이디 비번 입력");
            System.out.println("아이디: ");
            String id = scanner.nextLine();

            System.out.println("비번: ");
            String password = scanner.nextLine();
            if (map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("로그인 완료");
                    break;
                } else {
                    System.out.println("비번 불일치");
                }
            } else {
                System.out.println("존재하지 않는 아이디");
            }
        }
    }
}
