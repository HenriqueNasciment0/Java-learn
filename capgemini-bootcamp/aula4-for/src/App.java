import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nomeProduto;

        float custoProduto;
        float precoProduto;

        float totalCusto = 0.0f;
        float totalPreco = 0.0f;

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Digite o nome do produto:");
                nomeProduto = scanner.next();

                System.out.println("Digite o preço de CUSTO do produto:");
                custoProduto = scanner.nextFloat();

                System.out.println("Digite o preço de VENDA do produto:");
                precoProduto = scanner.nextFloat();

                if (custoProduto == precoProduto) {
                    System.out.println("Não se teve lucro nem perda.");
                } else {
                    if (custoProduto > precoProduto) {
                        System.out.println("Tivemos prejuízo.");
                    } else {
                        System.out.println("Tivemos lucro!");
                    }
                }

                totalCusto = totalCusto + custoProduto;
                totalPreco = totalPreco + precoProduto;

                System.out.println(nomeProduto + " teve valor de custo de: "
                        + custoProduto + " e o valor de venda de: " + precoProduto);

                System.out.println("A média de custo foi de: " + (totalCusto / i) +
                        " e a média de venda foi de: " + (totalPreco / i));

            }
        }

    }
}
