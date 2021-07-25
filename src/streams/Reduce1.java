package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        BinaryOperator<Integer> soma = Integer::sum;


        Integer total = array.stream()
                .reduce(soma).get();

        System.out.println(total);

        Integer total1 = array.parallelStream().reduce(100, soma);
        System.out.println(total1);

        array.stream().filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);


    }
}
