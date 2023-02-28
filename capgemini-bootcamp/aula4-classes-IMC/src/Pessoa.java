public class Pessoa {

    private float peso;
    private float altura;

    public float imc() {
        float imc = peso / (altura * altura);
        return imc;
    }

    public float setPeso(float peso) {
        this.peso = peso;
        return peso;
    }

    public float getPeso(float peso) {
        return peso;
    }

    public float setAltura(float altura) {
        this.altura = altura;
        return altura;
    }

    public float getAltura(float altura) {
        return altura;
    }

}
