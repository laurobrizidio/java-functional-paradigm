package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
//                new Aluno("Ana", 7.8, nome1, nota1, bomComportamento),
//                new Aluno("Bia", 5.8, nome1, nota1, bomComportamento),
//                new Aluno("Gui", 9.8, nome1, nota1, bomComportamento),
//                new Aluno("Rebeca", 6.8, nome1, nota1, bomComportamento),
//                new Aluno("Pedro", 7.1, nome1, nota1, bomComportamento),
//                new Aluno("Daniel", 8.8, nome1, nota1, bomComportamento)
        );

        Predicate<Aluno> somenteAprovados = a -> a.nota > 7;

        alunos.parallelStream()
                .filter(somenteAprovados)
                .map(a -> "Parabens " + a.nome)
                .forEach(System.out::println);


    }
}
