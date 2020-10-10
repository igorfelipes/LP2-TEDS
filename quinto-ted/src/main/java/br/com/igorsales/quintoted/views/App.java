package br.com.igorsales.quintoted.views;

import br.com.igorsales.quintoted.models.Banco;
import br.com.igorsales.quintoted.models.Conta;

import javax.swing.*;
import java.util.ArrayList;


public class App {

    public static void main(String[] args) {

        ArrayList<Conta> contas  = new ArrayList<>();


         String qtdStr = JOptionPane.showInputDialog("Digite a quantidade de contas: ");

         int qtd = Integer.parseInt(qtdStr);

         for(int count = 0; count < qtd; count++){
             int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta"));
             double saldoConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da conta"));

             contas.add(new Conta(numeroConta, saldoConta));
         }


         Banco banco = new Banco();
         Conta conta;
         conta = banco.getContaMaxSaldo(contas);

        String msg = "<html>CONTA DE MAIOR SALDO<br> Número da conta: " + conta.getNumero() +"<br>" + "Saldo: " +
                conta.getSaldo();

        JOptionPane optionPane = new JOptionPane();
        optionPane.setMessage(msg);
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog(null, "Banco");
        dialog.setVisible(true);


        System.out.println("Conta de maior saldo: "+ conta.toString());


    }

}
