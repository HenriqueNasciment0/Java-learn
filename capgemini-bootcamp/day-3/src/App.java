// Estruturas condicionais SE

import java.util.Random;

public class App {

    public static void main(String[] args) throws Exception {

        Random random = new Random();

        int nota = random.nextInt(10);

        System.out.println(nota);

        if (nota < 6) {
            System.out.println("REPROVADO!");
        } else {
            System.out.println("APROVADO!");
        }
    }
}
