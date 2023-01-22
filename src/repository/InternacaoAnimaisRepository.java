package repository;

import modelos.Animal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InternacaoAnimaisRepository {
    private static List<Animal> animaisInternados;


    public InternacaoAnimaisRepository() {
        this.animaisInternados = new ArrayList<>();
    }

    public void adicionarAnimalInternado(Animal animal) {
        if (animal.estaDoente()) {
            animal.setDataHoraInternacao(LocalDateTime.now());
            animaisInternados.add(animal);
            System.out.println("O " + animal.getTipo() + " com o nome " + animal.getNome() + " foi internado com sucesso!");
        } else {
            System.out.println("Somente animais doentes podem ser internados.");
            System.out.println();
        }
    }

    public void darAltaAnimal(Animal animal) {
        animal.setDataHoraAlta(LocalDateTime.now());
        animaisInternados.remove(animal);
//        animaisAtendidos.add(animal);
        System.out.println("O animal " + animal.getNome() + " recebeu alta. Um email foi enviado para o dono " + animal.getDono().getNome());
        System.out.println();
    }

    public static void listarAnimaisInternados() {
        for (Animal animais : animaisInternados) {
            System.out.println(animais.getNome() + " - " + animais.getDono());
        }
    }

}
