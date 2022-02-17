package thisIsJavaChapter11.hashCode;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        hashMap.put(new Key(1),"홍길동");
        System.out.println(hashMap.get(new Key(1)));

    }
}
