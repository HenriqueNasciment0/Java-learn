import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int nota = random.nextInt(11);

        System.out.println(nota);

        switch(nota) {

            case 8:
            System.out.println("Parabéns");
            break;

            case 10:
            System.out.println("Melhor do mundo! SIIIIU");
            break;

            case 6:
            System.out.println("Ladeira a baixo...");
            break;

            default:
            System.out.println("Menor que 6 reprova");
        }

    }
}
