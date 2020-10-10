package br.com.igorsales.quintoted.models;

import java.util.ArrayList;
import java.util.Collections;

public class Banco {

    private String razaoSocial;
    private  String CNPJ;

    public Banco() {
    }

    public Banco(String razaoSocial, String CNPJ) {
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", CNPJ='" + CNPJ + '\'' +
                '}';
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

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
