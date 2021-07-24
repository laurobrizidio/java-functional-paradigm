package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lucas", "Gui", "Ana", "Luana");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator...");

        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsando Strems");

        aprovados.stream().forEach(System.out::println);


    }
}
