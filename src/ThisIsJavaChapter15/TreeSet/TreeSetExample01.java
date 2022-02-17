package thisIsJavaChapter15.treeSet;

import java.util.TreeSet;

public class TreeSetExample01 {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(87);
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        Integer score = null;
        score = scores.first();
        System.out.println("가장 낮은 점수: " + score);

        System.out.println("가장 높은 점수: " + scores.last());
        System.out.println("95점 아래 점수: " + scores.lower(95));
        System.out.println("95점 위의 점수: " + scores.higher(95));
        System.out.println("95점 이거나 바로 아래 점수: " + scores.floor(95));
        System.out.println("96점 이거나 바로 위의 점수: " + scores.ceiling(96));
        while (!scores.isEmpty()) {
            System.out.println("꺼내온 가장 낮은 값: " + scores.pollFirst() + ", 남은 객체 수: " + scores.size());
        }
    }
}
