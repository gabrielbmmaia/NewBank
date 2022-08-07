package br.com.gabrielbmmaia.banco;

public class Main {

    public static void main(String[] args) {

        var primeiraConta = new Conta();
        var segundaConta = new Conta();

        primeiraConta.depositar(300);
        System.out.println(primeiraConta.getSaldo());
    }
}
