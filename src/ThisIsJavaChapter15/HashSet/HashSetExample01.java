package ThisIsJavaChapter15.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Study");
        set.add("Java");
        set.add("collection");
        set.add("List");
        set.add("Set");
        set.add("Map");
        System.out.println("총 객체수: " + set.size());

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.remove("List");
        set.remove("Map");
        System.out.println("총 객체수: " + set.size());

        set.clear();
        if (set.isEmpty()) System.out.println("비어있음");
    }
}
