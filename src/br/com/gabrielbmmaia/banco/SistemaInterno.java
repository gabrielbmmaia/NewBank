package br.com.gabrielbmmaia.banco;

public class SistemaInterno {

    private int senha = 555;

    public boolean autentica(Autenticador a) {
        if(a.autenticador(this.senha)){
            System.out.println("Acesso Permitido");
            return true;
        } else{
            System.out.println("Acesso Negado");
            return false;
        }
    }
}
