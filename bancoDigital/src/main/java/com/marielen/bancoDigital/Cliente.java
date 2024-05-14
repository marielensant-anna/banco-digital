/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bancoDigital;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta conta;
    private Banco banco;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
        banco.adicionarCliente(this);
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println("Conta: ");
        this.conta.imprimir();
     
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf + ", conta=" + conta + '}';
    }
}
