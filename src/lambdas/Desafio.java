package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto, Double> returnRealPrice = p -> p.preco * (1 - p.desconto);

        UnaryOperator<Double> applyImposto = p -> p >= 2500 ? p * 1.085 : p;

        UnaryOperator<Double> applyFrete = p -> p >= 3000 ? p + 100 : p + 50;

        Function<Double, String> formatToTwoDecimal = price -> new DecimalFormat("0.00").format(price);

        UnaryOperator<String> formatToPriceBr = value -> "R$ " + value;


        Produto p = new Produto("IPad", 100, 0.1);

        String preco = returnRealPrice
                .andThen(applyImposto)
                .andThen(applyFrete)
                .andThen(formatToTwoDecimal)
                .andThen(formatToPriceBr)
                .apply(p);

        System.out.println(preco);


    }
}
