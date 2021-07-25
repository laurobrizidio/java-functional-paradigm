package streams;

public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media();
        System.out
                .println(
                        m1
                                .adicionar(1)
                                .adicionar(5)
                                .getValor()
                );



    }
}
