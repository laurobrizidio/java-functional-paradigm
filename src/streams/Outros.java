package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno("Lauro", 4.8),
                new Aluno("Duca", 9.5),
                new Aluno("Luca", 9.6),
                new Aluno("Leonardo", 5.8),
                new Aluno("Leonardo", 5.8),
                new Aluno("Lauro", 4.8)
        );

        System.out.println("...distinct");
        alunos.stream().distinct().forEach(System.out::println);

    }
}
