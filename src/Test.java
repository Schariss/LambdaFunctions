import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
         printName.accept("Adnane");
         lineSeparator.run();
        System.out.println(addNumbers.apply(11, 11));
        lineSeparator.run();
    }

    public static Consumer<String> printName = (name) -> System.out.println("My name is " + name);

    public static Runnable lineSeparator = () -> System.out.println("--------------------------");

    public static BiFunction<Integer, Integer, Integer> addNumbers = (x1, x2) -> x1 + x2;
}
