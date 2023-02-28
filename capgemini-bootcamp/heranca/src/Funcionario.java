import java.sql.Date;

public class Funcionario {
    private String name;
    private float salario;
    private Date admissao;

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getAdmissao() {
        return this.admissao;
    }

    public Date setAdmissao(Date admissao) {
        return this.admissao = admissao;
    }
}
