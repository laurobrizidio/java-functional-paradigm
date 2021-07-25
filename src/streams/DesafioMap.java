package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
    final static UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
    final static Function<String, Integer> binaryToInt = s -> Integer.parseInt(s, 2);

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
                .map(Integer::toBinaryString)
                .map(inverter)
                .map(binaryToInt)
                .forEach(System.out::println);
    }


}
