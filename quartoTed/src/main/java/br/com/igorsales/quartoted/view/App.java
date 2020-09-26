package br.com.igorsales.quartoted.view;

import br.com.igorsales.quartoted.model.Funcionario;

import javax.swing.*;


public class App {

    public static void main(String[] args) {
        Funcionario [] funcionarios = new Funcionario[5];


        for(int i = 0; i < funcionarios.length; i++){

            String setorStr = JOptionPane.showInputDialog("Digite o identificador do setor: ");
            int idSetor = Integer.parseInt(setorStr);

            String salarioStr = JOptionPane.showInputDialog("Digite o salario: ");
            float salario = Float.parseFloat(salarioStr);

            String rgStr = JOptionPane.showInputDialog("Digite o rg: ");


            funcionarios[i] = new Funcionario(i, idSetor, salario, rgStr, true);
        }
        

        for(Funcionario funcionario : funcionarios){
            System.out.println("ID: "+ funcionario.getId());
            System.out.println("ID do Setor: "+ funcionario.getIdSetor());
            System.out.println("Salario: "+ funcionario.getSalario());
            System.out.println("RG: "+ funcionario.getRg());
            System.out.println("Está ativo?: "+ funcionario.isAtivo());
            System.out.println("----------------------------------------------------");
        }

    }
}
