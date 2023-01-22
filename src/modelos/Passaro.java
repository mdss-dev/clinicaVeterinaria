package modelos;

import modelos.enuns.EnumTipoAnimal;

public class Passaro extends Animal{

    private String corPenas;
    private boolean nascidoEmCativeiro;
    private boolean registrado;

    public Passaro() {}
    public Passaro(String nome, Dono dono, String raca, String idade, boolean estaDoente, EnumTipoAnimal tipo, String corPenas, boolean nascidoEmCativeiro, boolean registrado) {
        super(nome, dono, raca, idade, estaDoente, tipo);
    }

    public boolean getNascidoEmCativeiro() {
        return nascidoEmCativeiro;
    }

    public void setNascidoEmCativeiro(boolean nascidoEmCativeiro) {
        this.nascidoEmCativeiro = nascidoEmCativeiro;
    }

    public boolean getRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public String getCorPenas() {
        return corPenas;
    }

    public void setCorPenas(String corPenas) {
        this.corPenas = corPenas;
    }
}
