package thisIsJavaChapter14.consumerInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "Study");
        consumer.accept("java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("Java", "Study");

        DoubleConsumer doubleConsumer = d -> System.out.println(3 + d);
        doubleConsumer.accept(0.1592);

        ObjIntConsumer<Integer> objIntConsumer = (t, i) -> System.out.println(t + i);
        objIntConsumer.accept(10, 10);
    }
}
