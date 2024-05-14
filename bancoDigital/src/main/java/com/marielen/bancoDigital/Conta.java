/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bancoDigital;


public abstract class Conta implements IConta {
    
    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;
    
    private int agencia;
    private int numero;
    private double saldo;
  

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    @Override
    public void sacar(double valor){
       if (saldo < valor){
           throw new RuntimeException("Saldo insuficiente!");
       }
       saldo -= valor; 
    }
    
    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    
    @Override
    public void transferir (double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    @Override
    public void imprimir(){
        System.out.println("Conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Saldo: " + this.saldo); 
    }
    

}


