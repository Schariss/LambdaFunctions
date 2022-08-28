import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static Consumer<String> printName = (name) -> System.out.println("My name is " + name);

    public static Runnable lineSeparator = () -> System.out.println("--------------------------");

    public static BiFunction<Integer, Integer, Integer> addNumbers = (x1, x2) -> x1 + x2;

    public static MyFunctionalInterface<String, Integer> displayNumber = (str, number) -> {
        System.out.println(str + number);
    };

    public static MyFunctionalInterface<Integer, Integer> add2Numbers = (x1, x2) -> {
        System.out.println(x1 + x2);
    };

    public static void format(List<String> list, MyFormater formater) {
        int i = 0;
        for (String element : list) {
            i++;
            System.out.print(formater.format("%3d %s%n", i, element));
        }
    }
}
