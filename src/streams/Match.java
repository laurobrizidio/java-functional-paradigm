package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Lauro", 1.8),
                new Aluno("Lauro", 9.8),
                new Aluno("Lauro", 9.8),
                new Aluno("Lauro", 9.8)
        );
        Predicate<Aluno> aprovados = a -> a.nota > 7;

        System.out.println(alunos.stream().allMatch(aprovados));
    }
}
