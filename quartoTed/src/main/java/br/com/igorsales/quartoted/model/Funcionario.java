package br.com.igorsales.quartoted.model;

public class Funcionario {
    private int id;
    private int idSetor;
    private float salario;
    private String rg;
    private boolean ativo;

    public Funcionario() {
    }

    public Funcionario(int id, int idSetor, float salario, String rg, boolean ativo) {
        this.id = id;
        this.idSetor = idSetor;
        this.salario = salario;
        this.rg = rg;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void bonifica(float valorDoAumento){
        this.salario += valorDoAumento;
    }

    public void demite(){
        this.ativo = false;
    }
}
