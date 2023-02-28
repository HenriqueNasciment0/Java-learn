import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            Pessoa pessoaObj = new Pessoa();

            System.out.println("Informe seu peso:");
            pessoaObj.setPeso(scanner.nextFloat());

            System.out.println("Informe sua altura:");
            pessoaObj.setAltura(scanner.nextFloat());

            System.out.println("Seu IMC é: " + pessoaObj.imc());
        }

    }
}
