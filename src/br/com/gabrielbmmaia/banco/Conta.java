/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.gabrielbmmaia.banco;

import org.w3c.dom.ls.LSOutput;

/**
 * @author Gabriel Maia
 */
public class Conta {

    private int numero;
    private int agencia;
    private Cliente titular;
    private double saldo;

    public Conta(int numero, int agencia) {
        if(this.numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Apenas valores maiores que 0.");
        }
        if(this.agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("Apenas valores maiores que 0.");
        }
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return  this.saldo;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
}
