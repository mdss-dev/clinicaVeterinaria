package modelos;

import modelos.enuns.EnumTipoAnimal;

import java.time.LocalDateTime;

public class Animal {
    private static int idCounter = 0;
    private int identificador;
    private String nome;
    private String raca;
    private Dono dono;
    private String idade;
    private boolean estaDoente;
    private String sintomas;
    private EnumTipoAnimal tipo;
    private LocalDateTime dataHoraInternacao = null;
    private LocalDateTime dataHoraAlta = null;

    public Animal(){}
    public Animal(String nome, Dono dono, String raca, String idade, boolean estaDoente, EnumTipoAnimal tipo) {
        this.identificador = ++idCounter;
        this.nome = nome;
        this.dono = dono;
        this.raca = raca;
        this.idade = idade;
        this.estaDoente = estaDoente;
        this.tipo = tipo;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setTipo(EnumTipoAnimal tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dono getDono() {
        return dono;
    }

    public LocalDateTime getDataHoraInternacao() {
        return dataHoraInternacao;
    }

    public void setDataHoraInternacao(LocalDateTime dataHoraInternacao) {
        this.dataHoraInternacao = dataHoraInternacao;
    }

    public LocalDateTime getDataHoraAlta() {
        return dataHoraAlta;
    }

    public void setDataHoraAlta(LocalDateTime dataHoraAlta) {
        this.dataHoraAlta = dataHoraAlta;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public boolean estaDoente() {
        return estaDoente;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }


    public void setIdade(String idade) {
        this.idade = idade;
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public EnumTipoAnimal getTipo() {
        return tipo;
    }
}