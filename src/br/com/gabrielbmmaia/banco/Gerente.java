package br.com.gabrielbmmaia.banco;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente(String cpf, String nome, double salario) {
        super(cpf, nome, salario);
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autenticador(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Liberado");
            return true;
        } else {
            System.out.println("Acesso Negado");
            return false;
        }

    }
}
