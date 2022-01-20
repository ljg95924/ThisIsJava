package ThisIsJavaChapter11.ArraysClass;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        char[] arr1 = {'J', 'A', 'V', 'A'};

        char[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(arr2);

        char[] arr3 = Arrays.copyOfRange(arr1, 1,3);
        System.out.println(arr3);


    }
}
