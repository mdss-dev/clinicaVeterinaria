package repository;

import modelos.Animal;
import modelos.Dono;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private List<Animal> animais;
    private List<Dono> donos;

    public void AnimalRepository() {
        this.animais = new ArrayList<>();
        this.donos = new ArrayList<>();
    }

    public void adicionarDono(Dono dono) {
        donos.add(dono);
    }

    public Dono buscarDonoPeloId(int id) {
        for(Dono d: donos){
            if(d.getIdentificador() == id){
                return d;
            }
        }
        return null;
    }

    public Dono buscarDonoPeloCpf(String cpf) {
        for(Dono d: donos){
            if(d.getCpf().equals(cpf)){
                return d;
            }
        }
        return null;
    }

    public void adicionarAnimals(Animal animal, Dono dono) {
        animal.setDono(dono);
        animais.add(animal);
    }

    public void atualizarAnimals(Animal animal) {
        for(Animal a: animais){
            if(a.getIdentificador() == animal.getIdentificador()){
                a = animal;
                break;
            }
        }
    }

    public void excluirAnimals(int id) {
        for(Animal a: animais){
            if(a.getIdentificador() == id){
                animais.remove(a);
                break;
            }
        }
    }

    public List<Animal> listarAnimais() {
        return animais;
    }

    public Animal buscarAnimalsPeloId(int id) {
        for(Animal a: animais){
            if(a.getIdentificador() == id){
                return a;
            }
        }
        return null;
    }
}
