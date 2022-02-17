package thisIsJavaChapter15.treeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample03 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("d보다 낮은 단어 검색");
        NavigableSet<String> lower = treeSet.headSet("d", true);
        for (String word : lower) {
            System.out.println(word);
        }

        System.out.println("d 보다 높은 단어 검색");
        NavigableSet<String> higher = treeSet.tailSet("d", true);
        for (String word : higher) {
            System.out.println(word);
        }

        System.out.println("c~f 사이의 단어 갬색");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        for (String word : rangeSet) {
            System.out.println(word);
        }
    }
}
