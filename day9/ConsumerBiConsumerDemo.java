package day9;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerBiConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = (s)->System.out.println(s.toUpperCase());
        consumer.accept("sagnik");
        BiConsumer<Integer , Integer> biconsumer = (a,b)->System.out.println(a+b);
        biconsumer.accept(23, 23);
    }
}
