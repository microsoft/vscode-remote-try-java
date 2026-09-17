package com.mycompany.app.Model;

public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade){
        super(nome);
        this.idade = idade;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public Emprestimo[] getHistoricoEmprestimos(){
        return historicoEmprestimos;
    }

    public void setHistoricoEmprestimos(Emprestimo[] emprestimo){
        this.historicoEmprestimos = emprestimo;
    }
}