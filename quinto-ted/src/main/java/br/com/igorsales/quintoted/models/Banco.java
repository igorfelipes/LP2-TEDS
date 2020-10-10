package br.com.igorsales.quintoted.models;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {

    private String razaoSocial;
    private  String CNPJ;


    public Conta getContaMaxSaldo(ArrayList<Conta> contas ){
        ArrayList<Double> values = new ArrayList<>();

        for(Conta conta: contas){
            values.add(conta.getSaldo());
        }

        double value = Collections.max(values);

        for(Conta conta: contas){
            if(conta.getSaldo() == value){
                return conta;
            }
        }
        return null;
    }
}
