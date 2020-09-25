package br.com.igorsales.segundoted.view;

import br.com.igorsales.segundoted.model.Retangulo;

public class App {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(30, 10, 2);

        //System.out.println("Área do retângulo: "+ retangulo.getArea());
        System.out.println("Area da Moldura: "+ retangulo.getMolduraArea() );
    }
}
