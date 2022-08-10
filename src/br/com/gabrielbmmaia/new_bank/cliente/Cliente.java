package br.com.gabrielbmmaia.new_bank.cliente;

public class Cliente {

    private String cpf;
    private String profissao;
    private String nome;

    public Cliente(String cpf, String profissao, String nome) {
        this.cpf = cpf;
        this.profissao = profissao;
        this.nome = nome;
    }

    public Cliente() {

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
