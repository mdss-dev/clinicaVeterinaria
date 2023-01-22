package modelos;

import modelos.enuns.EnumTipoAnimal;

public class Gato extends Animal{

    private String corPelo;

    public Gato(String nome, Dono dono, String raca, int idade, boolean estaDoente, EnumTipoAnimal tipo,String corPelo) {
        super(nome, dono, raca, idade, estaDoente, tipo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
