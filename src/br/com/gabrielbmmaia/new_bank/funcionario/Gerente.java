package br.com.gabrielbmmaia.new_bank.funcionario;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha = 555;

    public Gerente(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    public int getSenha() {
        return senha;
    }
}
