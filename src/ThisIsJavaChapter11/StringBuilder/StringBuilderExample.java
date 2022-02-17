package thisIsJavaChapter11.stringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Java");
        stringBuilder.append("Program");
        System.out.println(stringBuilder.toString());

        stringBuilder.insert(4, "2");
        System.out.println(stringBuilder.toString());

        stringBuilder.setCharAt(4, '6');
        System.out.println(stringBuilder.toString());

        stringBuilder.replace(6, 13, "Book");
        System.out.println(stringBuilder.toString());

        stringBuilder.delete(4, 5);
        System.out.println(stringBuilder.toString());

        String result = stringBuilder.toString();
        System.out.println(result);
    }
}
