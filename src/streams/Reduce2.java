package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Ana", 7.1),
                new Aluno("Luna", 6.1),
                new Aluno("Gui", 8.1),
                new Aluno("Gabi", 10)
        );

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> apenasNota = a -> a.nota;
        BinaryOperator<Double> somatorio = Double::sum;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio);

    }
}
