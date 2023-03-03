import java.util.Scanner;

public class CarStore {

    private int quantidade;
    private float valor;
    private int ano;

    float desconto = 0.10f;
    float comDesonto = 0.0f;

    // public CarStore(int quantidade, float valor, int ano) {
    //     this.quantidade = quantidade;
    //     this.valor = valor;
    //     this.ano = ano;
    // }

    public float aplicaDesconto() {
        if (ano < 2005 && ano > 1990) {
            return comDesonto = valor * desconto;
        } else {
            return valor;
        }
    }

    public void relatorio() {

        char desejaRepetir = 's';
        int totalDeCarros = 0;
        int carrosAntigos = 0;

        try (Scanner scanner = new Scanner(System.in)) {

            while(desejaRepetir == 's' || desejaRepetir == 'S') {
                System.out.println("Qual ano do seu veículo?");
                this.ano = scanner.nextInt();

                System.out.println("Qual valor do seu veículo?");
                this.valor = scanner.nextInt();

                if(this.ano < 2005 && this.ano > 1990) {
                    carrosAntigos = carrosAntigos + 1;
                }

                totalDeCarros = totalDeCarros + 1;

                System.out.println("Deseja cadastrar outro veículo?");
                desejaRepetir = scanner.next().charAt(0);

                System.out.println("A quantidade total de carros é: " + totalDeCarros);
                System.out.println("A quantidade total de carros antigos é: " + carrosAntigos);


            }

        }

    }

    public int setQuantidade(int quantidade) {
        return this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public float setValor(int valor) {
        return this.valor = valor;
    }

    public float getValor() {
        return this.valor;
    }

    public int setAno(int ano) {
        return this.ano = ano;
    }

    public int getAno() {
        return this.ano;
    }

}
