package modelos.builders;

import modelos.Dono;
import modelos.Passaro;
import modelos.enuns.EnumTipoAnimal;

public class PassaroBuilder {
    private Passaro passaro;

    public PassaroBuilder() {
        this.passaro = new Passaro();
    }

    public PassaroBuilder nome(String nome) {
        this.passaro.setNome(nome);
        return this;
    }
    public PassaroBuilder raca(String raca) {
        this.passaro.setRaca(raca);
        return this;
    }
    public PassaroBuilder dono(Dono dono) {
        this.passaro.setDono(dono);
        return this;
    }
    public PassaroBuilder idade(String idade){
        this.passaro.setIdade(idade);
        return this;
    }
    public PassaroBuilder estaDoente(boolean estaDoente){
        this.passaro.setEstaDoente(estaDoente);
        return this;
    }

    public PassaroBuilder sintomas(String sintomas){
        this.passaro.setSintomas(sintomas);
        return this;
    }
    public PassaroBuilder tipo(EnumTipoAnimal tipo){
        this.passaro.setTipo(tipo);
        return this;
    }
    public PassaroBuilder corPenas(String corPenas){
        this.passaro.setCorPenas(corPenas);
        return this;
    }
    public PassaroBuilder nascidoEmCativeiro(boolean nascidoEmCativeiro){
        this.passaro.setNascidoEmCativeiro(nascidoEmCativeiro);
        return this;
    }
    public PassaroBuilder registrado(boolean registrado){
        this.passaro.setRegistrado(registrado);
        return this;
    }
    public Passaro build(){
        return this.passaro;
    }
}
