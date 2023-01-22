package modelos;

import modelos.enuns.*;

public class Cachorro extends Animal {

    private EnumTamanhoCachorro tamanho;
    private String corPelo;
    public Cachorro(){
        super();
    };

    public Cachorro(String nome, Dono dono, String raca, int idade, boolean estaDoente, EnumTipoAnimal tipo, EnumTamanhoCachorro tamanho, String corPelo) {
        super(nome, dono, raca, idade, estaDoente, tipo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public EnumTamanhoCachorro getTamanho() {
        return tamanho;
    }

    public void setTamanho(EnumTamanhoCachorro tamanho) {
        this.tamanho = tamanho;
    }
}
