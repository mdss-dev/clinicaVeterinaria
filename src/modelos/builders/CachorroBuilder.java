package modelos.builders;

import modelos.Animal;
import modelos.Cachorro;
import modelos.Dono;
import modelos.enuns.EnumTamanhoCachorro;
import modelos.enuns.EnumTipoAnimal;

public class CachorroBuilder {
    private Cachorro cachorro;

    public CachorroBuilder() {
        this.cachorro = new Cachorro();
    }

    public CachorroBuilder nome(String nome) {
        this.cachorro.setNome(nome);
        return this;
    }
    public CachorroBuilder raca(String raca) {
        this.cachorro.setRaca(raca);
        return this;
    }
    public CachorroBuilder castrado(boolean castrado) {
        this.cachorro.setCastrado(castrado);
        return this;
    }
    public CachorroBuilder dono(Dono dono) {
        this.cachorro.setDono(dono);
        return this;
    }
    public CachorroBuilder idade(String idade){
        this.cachorro.setIdade(idade);
        return this;
    }
    public CachorroBuilder estaDoente(boolean estaDoente){
        this.cachorro.setEstaDoente(estaDoente);
        return this;
    }
    public CachorroBuilder sintomas(String sintomas){
        this.cachorro.setSintomas(sintomas);
        return this;
    }
    public CachorroBuilder tipo(EnumTipoAnimal tipo){
        this.cachorro.setTipo(tipo);
        return this;
    }
    public CachorroBuilder tamanho(EnumTamanhoCachorro tamanho){
        this.cachorro.setTamanho(tamanho);
        return this;
    }
    public CachorroBuilder corPelo(String corPelo){
        this.cachorro.setCorPelo(corPelo);
        return this;
    }
    public Cachorro build(){
        return this.cachorro;
    }

}
