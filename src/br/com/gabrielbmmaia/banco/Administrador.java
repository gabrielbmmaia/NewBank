package br.com.gabrielbmmaia.banco;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha = 333;

    public Administrador(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    public int getSenha() {
        return senha;
    }
}
