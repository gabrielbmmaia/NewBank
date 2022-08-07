package br.com.gabrielbmmaia.banco;

public class Main {

    public static void main(String[] args) {

        var primeiraConta = new Conta(133,12345);
        var segundaConta = new Conta(133, 12344);
        primeiraConta.setTitular(new Cliente("222.222.222-22", "Programador", "Gabriel Maia"));

        primeiraConta.depositar(300);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(primeiraConta.getTitular().getCpf());



    }
}
