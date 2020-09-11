package br.com.igorsales.primeiroted.segundaquestao;

public class MainSegundaQuestao {

    public static void main(String[] args) {

        Bhaskara bhaskara = new Bhaskara(1, 9, 5);

        bhaskara.calcBhaskara();
        bhaskara.calcX1();
        bhaskara.calcX2();

        System.out.println("DELTA: "+ bhaskara.getDelta());
        System.out.println("X1: "+ bhaskara.getX1());
        System.out.println("X2: "+ bhaskara.getX2());
    }
}
