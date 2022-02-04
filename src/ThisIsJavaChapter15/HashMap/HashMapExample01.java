package ThisIsJavaChapter15.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample01 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("김동수", 90);
        map.put("김연모", 95);
        map.put("박지원", 85);
        map.put("김동수", 80);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println("김동수 객체 찾기 " + map.get("김동수"));

        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println();

        map.remove("김동수");
        System.out.println("총 Entry 수: " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);

        }
    }
}
