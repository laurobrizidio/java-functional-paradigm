package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = number -> number % 2 == 0;
        Predicate<Integer> isTresDigitos = number -> number >= 100 && number < 999;

        System.out.println(isPar.test(2));
        System.out.println(isTresDigitos.test(200));
        System.out.println(isPar.and(isTresDigitos).test(121));
    }
}
