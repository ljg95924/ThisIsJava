package thisIsJavaChapter11.getClassAndForName;

import thisIsJavaChapter10.Account;

public class ClassExample {
    public static void main(String[] args) {
        Account account = new Account();
        Class clazz1 = account.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());
        System.out.println();

        try {
            Class clazz2 = Class.forName("thisIsJavaChapter10.Account");
            System.out.println(clazz2.getName());
            System.out.println(clazz2.getSimpleName());
            System.out.println(clazz2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
