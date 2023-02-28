public class Vendedor extends Funcionario {

    private int totalVendas;
    private float comissaoPorVenda;

    public Vendedor() {
        super();
    }

    public float totalSalario() {
        return super.getSalario() + (this.comissaoPorVenda * this.totalVendas);
    }

    public float getComissaoPorVenda() {
        return this.comissaoPorVenda;
    }

    public float setComissaoPorVenda(float comissaoPorVenda) {
        return this.comissaoPorVenda = comissaoPorVenda;
    }

    public int getTotalVendas() {
        return this.totalVendas;
    }

    public int setTotalVendas(int totalVendas) {
        return this.totalVendas = totalVendas;
    }
}
