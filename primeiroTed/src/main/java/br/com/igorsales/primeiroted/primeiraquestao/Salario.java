package br.com.igorsales.primeiroted.primeiraquestao;

public class Salario {

    float salario;

    public float getSalarioBruto() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float calcIPRF(){
        return (float) (0.11 * this.salario);
    }

    public float calcINSS(){
        return (float) (0.08 * this.salario);
    }

    public float calcSindicato(){
        return (float) (0.05 * this.salario);
    }

    public float calcSalarioLiquido(){
        return this.getSalarioBruto() - this.calcINSS() - this.calcIPRF() - this.calcSindicato();
    }

    public float valorDescontado(){
        return  this.calcSindicato() + this.calcIPRF() - this.calcINSS();
    }
}
