package br.com.gabrielbmmaia.new_bank.funcionario;

public class ControleSalario {

    private double somaDosSalarios;

    public void registra(Funcionario funcionario) {
        this.somaDosSalarios += funcionario.getSalario();
    }

    public double getSomaDosSalarios() {
        return somaDosSalarios;
    }
}
