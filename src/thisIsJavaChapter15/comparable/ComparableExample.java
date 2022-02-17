package thisIsJavaChapter15.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        //저장될때 나이순으로 저장됨
        treeSet.add(new Person("람라", 18));
        treeSet.add(new Person("온조", 19));
        treeSet.add(new Person("청산", 20));

        Iterator<Person> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person.getName() + ":" + person.getAge());
        }
    }
}
