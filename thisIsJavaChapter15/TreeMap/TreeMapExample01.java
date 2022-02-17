package thisIsJavaChapter15.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample01 {
    public static void main(String[] args) {
        TreeMap<Integer, String> scores = new TreeMap<>();
        scores.put(87, "이이");
        scores.put(98, "람라");
        scores.put(75, "온조");
        scores.put(95, "청산");
        scores.put(80, "수혁");

        Map.Entry<Integer, String> entry = null;

        entry = scores.firstEntry();
        System.out.println("가장 낮은 점수: " + entry.getKey() + "-" + entry.getValue());

        System.out.println("가장 높은 점수: " + scores.lastEntry().getKey() + "-" + scores.lastEntry().getValue());
        System.out.println("95점 위 점수: " + scores.higherKey(95) + "-" + scores.higherEntry(95).getValue());
        System.out.println("95점 아래 점수: " + scores.lowerEntry(95));
        System.out.println("95점 이거나 바로 아래 점수: " + scores.floorEntry(95));
        System.out.println("95점 이거나 바로 위의 점수: " + scores.ceilingEntry(95).getKey() + "-" + scores.ceilingEntry(95).getValue());

        while (!scores.isEmpty()) {
            entry = scores.pollFirstEntry();
            System.out.println(entry.getKey() + "-" + entry.getValue() + " 남은 객체 수: " + scores.size());
        }

    }
}
