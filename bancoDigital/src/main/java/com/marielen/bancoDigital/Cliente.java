/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bancoDigital;

/**
 *
 * @author CCE
 */
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    /*public Cliente(String nome, String cpf, Conta contaPoupanca){
        this.nome = nome;
        this.cpf = cpf;
        this.contaPoupanca = contaPoupanca;
    }*/
    
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", cpf=" + cpf +  '}';
    }
     
   
}
