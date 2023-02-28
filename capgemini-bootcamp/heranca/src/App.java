public class App {
    public static void main(String[] args) throws Exception {
        Vendedor v = new Vendedor();

        v.setName("Henrique Nascimento");
        v.setSalario(3500.0f);
        v.setTotalVendas(26);
        v.setComissaoPorVenda(25.5f);


        System.out.println("O Vendedor " + v.getName() +
        " teve nesse mês o salário de: " + v.totalSalario());
    }
}
