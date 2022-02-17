package thisIsJavaChapter15.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("고정된","객체들로","구성될때","사용");
        for(String str: list){
            System.out.println(str);
        }
    }
}
