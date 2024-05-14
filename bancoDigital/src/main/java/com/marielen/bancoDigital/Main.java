/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.marielen.bancoDigital;


public class Main {
    //incluir novas classes, atributos e/ou metodos (listar todos os clientes, listar todas as contas, etc...
    //incluir o lombok ao projeto para diminuir a verbosidade do código
    public static void main(String[] args) {
        
        Banco bb = new Banco("Banco do Brasil");
        
        Cliente marielen = new Cliente("Marielen", "043.987.987-43");
   
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.imprimir();
        
        bb.adicionarContaCorrente(cc);
        bb.adicionarContaPoupanca(cp);
        bb.adicionarCliente(marielen);
       
        bb.imprimirBanco();
        
        cc.depositar(200);
        cc.sacar(40);
        cc.transferir(10, cp);
        cc.imprimir();
        
        cp.depositar(10);
        cp.imprimir();
    }
    
}
