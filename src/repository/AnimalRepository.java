package repository;

import modelos.Animal;
import modelos.Dono;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private static List<Animal> animaisAtentidos = new ArrayList<>() ;
    private static List<Dono> donos = new ArrayList<>();


    public void AnimalRepository() {
    }


    public Dono buscarDonoPeloId(int identificador) {
        for(Dono d: donos){
            if(d.getIdentificador() == identificador){
                return d;
            }
        }
        return null;
    }

    public static void buscarDonoPeloCpf(String cpf) {
        for(Dono d: donos){
            if(d.getCpf().equals(cpf)){
                System.out.println("Dono encontrado pelo CPF: " +d.getNome());
                System.out.println();
                return;
            }
        }
        System.out.println("Dono não encontrado");
    }

    public static void atenderAnimal(Animal animal, Dono dono) {
        animal.setDono(dono);
        animaisAtentidos.add(animal);
    }

    public static void atualizarAnimals(Animal animal) {
        for(Animal a: animaisAtentidos){
            if(a.getIdentificador() == animal.getIdentificador()){
                a = animal;
                System.out.println("Animal "+animal.toString()+" atualizado");
                break;
            }
        }
    }

    public static void excluirAnimals(int identificador) {
        for(Animal a: animaisAtentidos){
            if(a.getIdentificador() == identificador){
                animaisAtentidos.remove(a);
                break;
            }
        }
    }

    public static Animal buscarAnimalsPeloId(int identificador) {
        for(Animal a: animaisAtentidos){
            if(a.getIdentificador() == identificador){
                return a;
            }
        }
        return null;
    }
    public static void listarAnimaisAtendidos() {
        System.out.println();
        for (Animal animais : animaisAtentidos) {
            System.out.println(animais.toString());
        }
    }

}
