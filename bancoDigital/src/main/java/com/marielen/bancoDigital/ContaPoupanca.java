/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marielen.bancoDigital;

public class ContaPoupanca extends Conta {
  private String tipoConta = "Poupança";
    
  @Override
  public void imprimir(){
      System.out.println("Tipo da Conta: " + this.tipoConta);
      super.imprimir();
  }

     @Override
    public String toString() {
        return "Conta Poupança{" + "agencia=" + super.getAgencia() + ", numero=" + super.getNumero() + ", saldo=" + super.getSaldo() + '}';
    }
  
}
