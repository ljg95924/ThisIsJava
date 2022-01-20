package ThisIsJavaChapter11.ArraysClass;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args) {
        int[] scores = {99, 97, 98};
        Arrays.sort(scores);
        int index = Arrays.binarySearch(scores, 99);
        System.out.println(index);

        String[] names = {"아이유", "윤하", "린"};
        Arrays.sort(names);
        index = Arrays.binarySearch(names, "아이유");
        System.out.println(index);

        Member member1 = new Member("아이유");
        Member member2 = new Member("윤하");
        Member member3 = new Member("린");
        Member[] members = {member1, member2, member3};
        Arrays.sort(members);
        System.out.println(Arrays.binarySearch(members, member1));
    }
}
