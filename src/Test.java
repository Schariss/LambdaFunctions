import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        LambdaFunctions.printName.accept("Adnane");
        LambdaFunctions.lineSeparator.run();

        System.out.println(LambdaFunctions.addNumbers.apply(11, 11));
        LambdaFunctions.lineSeparator.run();

        LambdaFunctions.displayNumber.display("My number is : ", 55);
        LambdaFunctions.lineSeparator.run();

        LambdaFunctions.add2Numbers.display(45, 55);
        LambdaFunctions.lineSeparator.run();

        List<String> fruits = Arrays.asList("melon", "abricot", "fraise", "cerise");
        //LambdaFunctions.format(fruits, (format, arguments) -> String.format(format, arguments));
        LambdaFunctions.format(fruits, String::format);
        LambdaFunctions.lineSeparator.run();

        Integer[] numbersToSort = {10, 1, 22, 5, 9, 11, 3};
        Arrays.sort(numbersToSort, Integer::compare);
        Arrays.stream(numbersToSort).forEach(x -> System.out.print(x + " "));
        System.out.println(Arrays.deepToString(numbersToSort));

        class Person{
            private String name;
        }
        Supplier<Person> person = Person::new;
        Person p = person.get();
        p.name = "Adnane";
        System.out.println(p.name);
    }

}
