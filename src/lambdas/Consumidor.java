package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = System.out::println;
        Produto produto = new Produto("Caneta", 2.34, 0.1);
//        imprimir.accept(produto);


        List<Produto> listProdutos = Arrays.asList(
                produto,
                new Produto(
                        "Carro", 20000.00, 0.2
                ),
                new Produto("Caderno", 100.12, 0.2),
                new Produto("Borracha", 400.00, 0.2),
                new Produto("Lapis", 5.35, 0.05)
        );

        listProdutos.forEach(imprimir);
    }


}
