package modelos.builders;

import modelos.Dono;
import modelos.Gato;
import modelos.enuns.EnumTamanhoCachorro;
import modelos.enuns.EnumTipoAnimal;

public class GatoBuilder {
    private Gato gato;

    public GatoBuilder() {
        this.gato = new gato();
    }

    public GatoBuilder nome(String nome) {
        this.gato.setNome(nome);
        return this;
    }
    public GatoBuilder raca(String raca) {
        this.gato.setRaca(raca);
        return this;
    }
    public GatoBuilder castrado(boolean castrado) {
        this.gato.setCastrado(castrado);
        return this;
    }
    public GatoBuilder dono(Dono dono) {
        this.gato.setDono(dono);
        return this;
    }
    public GatoBuilder idade(int idade){
        this.gato.setIdade(idade);
        return this;
    }
    public GatoBuilder estaDoente(boolean estaDoente){
        this.gato.setEstaDoente(estaDoente);
        return this;
    }
    public GatoBuilder tipo(EnumTipoAnimal tipo){
        this.gato.setTipo(tipo);
        return this;
    }
    public GatoBuilder corPelo(String corPelo){
        this.gato.setCorPelo(corPelo);
        return this;
    }
}
