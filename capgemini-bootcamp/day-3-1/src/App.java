import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int nota = random.nextInt(11);

        System.out.println(nota);

        switch(nota) {

            case 5,4,3,2,1,0:
            System.out.println("REPROVOU! ATÉ ANO QUE VEM AQUI DE NOVO... :(");
            break;

            case 7,8,9:
            System.out.println("Parabéns");
            break;

            case 10:
            System.out.println("Melhor do mundo! SIIIIU");
            break;

            default:
            System.out.println("Importante é passar!");
        }

    }
}
