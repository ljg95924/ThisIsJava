package ThisIsJavaChapter15.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample02 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("아이유", 30));
        set.add(new Member("윤하", 33));
        set.add(new Member("윤하", 33));

        System.out.println("총 객체수: " + set.size());
    }
}
