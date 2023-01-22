package repository;

import modelos.Animal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InternacaoAnimais {
    private List<Animal> animaisInternados = new ArrayList<Animal>();
    private List<Animal> animaisAtendidos = new ArrayList<Animal>();


    public InternacaoAnimais() {
        this.animaisInternados = new ArrayList<>();
    }

    public void adicionarAnimalInternado(Animal animal) {
        if (animal.estaDoente()) {
            animal.setDataHoraInternacao(LocalDateTime.now());
            animaisInternados.add(animal);
            System.out.println("Animal internado com sucesso!");
        } else {
            System.out.println("Somente animais doentes podem ser internados.");
        }
    }

    public void darAltaAnimal(Animal animal) {
        animal.setDataHoraAlta(LocalDateTime.now());
        animaisInternados.remove(animal);
        animaisAtendidos.add(animal);
        System.out.println("O animal " + animal.getNome() + " recebeu alta. Um email foi enviado para o dono " + animal.getDono().getNome());
    }

    public List<Animal> listarAnimaisInternados() {
        return animaisInternados;
    }

    public List<Animal> listarAnimaisAtendidos() {
        return animaisAtendidos;
    }
}
