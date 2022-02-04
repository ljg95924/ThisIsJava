package ThisIsJavaChapter15.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Study");
        list.add("for");
        list.add("employment");
        list.add(0, "Basic");

        System.out.println("총 객체수: " + list.size());
        System.out.println();

        System.out.println("2: " + list.get(2));
        System.out.println();

        for (String str : list
        ) {
            System.out.println(str);
        }
        System.out.println();

        list.remove(3);
        list.remove(3);
        list.remove("Basic");

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}
