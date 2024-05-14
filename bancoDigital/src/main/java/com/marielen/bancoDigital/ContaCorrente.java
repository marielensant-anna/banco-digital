/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bancoDigital;


public class ContaCorrente extends Conta {
    
   private String tipoConta = "Corrente";
    
   @Override
    public void imprimir(){
      System.out.println("Tipo da Conta: " + this.tipoConta);
      super.imprimir();
  }

    @Override
    public String toString() {
        return "Conta Corrente{" + "agencia=" + super.getAgencia() + ", numero=" + super.getNumero() + ", saldo=" + super.getSaldo() + '}';
    }

    
}
