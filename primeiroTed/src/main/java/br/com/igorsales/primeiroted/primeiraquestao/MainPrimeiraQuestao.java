package br.com.igorsales.primeiroted.primeiraquestao;

public class MainPrimeiraQuestao {

    public static void main(String[] args) {
        Salario salario = new Salario();
        salario.setSalario(1200);

        System.out.println("Salario Bruto: "+ salario.getSalarioBruto());
        System.out.println("Salario Liquido: "+ salario.calcSalarioLiquido());
        System.out.println("IPRF: "+ salario.calcIPRF());
        System.out.println("INSS: "+ salario.calcINSS());
        System.out.println("Sindicato: "+ salario.calcSindicato());
        System.out.println("Valor total descontado: "+ salario.valorDescontado());
    }

}
