package br.com.gabrielbmmaia.banco;

public class Administrador extends Funcionario implements Autenticador{

    private int senha = 555;

    public Administrador(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    @Override
    public boolean autenticador(int senha) {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
