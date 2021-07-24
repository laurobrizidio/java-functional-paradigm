package lambdas;

public class App {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Trabalho01());
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Trabalho 02");
            }
        });

        t1.start();
        t2.start();
    }
}
