package br.com.gabrielbmmaia.banco;

public class Gerente extends Funcionario implements Autenticador {

    private int senha = 555;

    public Gerente(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    public boolean autenticador(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

}
