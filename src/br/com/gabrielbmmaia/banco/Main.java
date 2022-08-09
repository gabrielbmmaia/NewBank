package br.com.gabrielbmmaia.banco;

public class Main {

    public static void main(String[] args) {

        var gerente = new Gerente("222.222.222-22", "Gabriel Maia", 4000);
        var si = new SistemaInterno();
        var seguranca = new Seguranca("333.333.333-33", "Jorge dos Santos", 2000);
        var adm = new Administrador("222.222.222-22", "Gabriel Maia", 4000);



        si.autentica(gerente);
        si.autentica(adm);


    }
}
