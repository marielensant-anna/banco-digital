/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bancoDigital;

import java.util.ArrayList;
import java.util.List;


public class Banco {
    
    private String nome;
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
    
    public void imprimirBanco(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Contas: " + contas);
        System.out.println("Clientes:" + clientes);
    }
   
    
    public void adicionarContaCorrente(Conta contaCorrente){
       contas.add(contaCorrente);
    }
    
    public void adicionarContaPoupanca(Conta contaPoupanca){
       contas.add(contaPoupanca);
    }
    
    public void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    
    
    
}
