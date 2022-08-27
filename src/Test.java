import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
         printName.accept("Adnane");
    }

    public static Consumer<String> printName = (name) -> System.out.println(name);
}
