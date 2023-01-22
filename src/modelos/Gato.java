package modelos;

import modelos.enuns.EnumTipoAnimal;

public class Gato extends Animal{

    private String corPelo;
    private boolean castrado;

    public Gato(){}
    public Gato(String nome, Dono dono, String raca, String idade, boolean estaDoente,String sintomas, EnumTipoAnimal tipo,String corPelo, boolean castrado) {
        super(nome, dono, raca, idade, estaDoente, sintomas, tipo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
}
