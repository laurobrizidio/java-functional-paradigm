package streams;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public interface Utils {
    UnaryOperator<String> maiuscula = String::toUpperCase;
    UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
    UnaryOperator<String> grito = n -> n + "!!!";

    Function<String, String> solve = maiuscula
            .andThen(primeiraLetra)
            .andThen(grito);

}
