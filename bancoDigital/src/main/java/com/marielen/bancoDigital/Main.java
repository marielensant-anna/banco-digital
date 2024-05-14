/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.marielen.bancoDigital;


public class Main {

    //incluir o lombok ao projeto para diminuir a verbosidade do código
    public static void main(String[] args) {
        
        Banco bb = new Banco("Banco do Brasil");
        Banco itau = new Banco ("Itau");
        
        Cliente marielen = new Cliente("Marielen", "043.987.987-43");
        
        Cliente jose = new Cliente("Jose", "987.876.453-90");
   
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
      
        
        marielen.setConta(cc);
        marielen.setBanco(bb);
        jose.setConta(cp);
        jose.setBanco(itau);
        
        cc.depositar(100);
        cc.transferir(50, cp);
        marielen.imprimir();
        
        
        cp.depositar(50);
        cp.sacar(25);
        jose.imprimir();
        
        bb.imprimirBanco();
        itau.imprimirBanco();
        //
        
    }
    
}
