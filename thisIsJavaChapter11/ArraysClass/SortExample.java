package thisIsJavaChapter11.arraysClass;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        String[] names = {"아이유", "윤하", "린"};
        Arrays.sort(names);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        Member m1 = new Member("아이유");
        Member m2 = new Member("윤하");
        Member m3 = new Member("린");
        Member[] members = {m1, m2, m3};
        Arrays.sort(members);
        System.out.println(members[0].name);
        System.out.println(members[1].name);
        System.out.println(members[2].name);
    }
}
