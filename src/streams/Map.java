package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import static streams.Utils.solve;


public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        marcas.stream()
                .map(solve)
                .forEach(print);


    }
}
