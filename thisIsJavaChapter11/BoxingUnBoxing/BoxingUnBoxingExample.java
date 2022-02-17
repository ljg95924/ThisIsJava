package thisIsJavaChapter11.boxingUnBoxing;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        //Boxing
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer(200);

        //UnBoxing
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();

        System.out.println(value1);
        System.out.println(value2);
    }
}
