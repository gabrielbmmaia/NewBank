package br.com.gabrielbmmaia.banco;

// A classe é abstrata para servir para todos os tipos de funcionários da empresa, porém não poder instancializa-la
public abstract class Funcionario {

    private String cpf;
    private String nome;
    private double salario;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
