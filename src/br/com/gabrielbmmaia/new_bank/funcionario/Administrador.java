package br.com.gabrielbmmaia.new_bank.funcionario;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha = 555;

    public Administrador(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    public int getSenha() {
        return senha;
    }
}
