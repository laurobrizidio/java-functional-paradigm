package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Produto prod = new Produto("Notebook ", 1040.3, 0.1);
        Predicate<Produto> isCaro = produto -> produto.preco > 100;

        System.out.println("O produto " + prod.nome + "é caro?:" + isCaro.test(prod));
    }

}