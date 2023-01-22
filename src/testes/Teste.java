package testes;

import modelos.*;
import repository.AnimalRepository;
import repository.InternacaoAnimaisRepository;

import java.util.List;

public class Teste {
    public static void main(String[] args) {
            AnimalRepository animalRepo = new AnimalRepository();
            InternacaoAnimaisRepository internacao = new InternacaoAnimaisRepository();

            // Criando donos
            Dono dono1 = new Dono("João", "123.456.789-10", "11 99999-9999", new Endereco("Rua Teste", "Cidade Teste", "Estado Teste", "00000-000"), "joao@email.com");
            Dono dono2 = new Dono("Maria", "987.654.321-10", "11 88888-8888", new Endereco("Rua Teste 2", "Cidade Teste 2", "Estado Teste 2", "11111-111"), "maria@email.com");
            animalRepo.adicionarDono(dono1);
            animalRepo.adicionarDono(dono2);

            // Criando animais
            Animal animal1 = new Cachorro("Rex", dono1, "Pastor Alemão", 5, false);
            Animal animal2 = new Gato("Mia", dono2, "Siamesa", 2, true);
            Animal animal3 = new Passaro("Polly", dono1, "Papagaio", 10, false);
            animalRepo.adicionarAnimals(animal1, dono1);
            animalRepo.adicionarAnimals(animal2, dono2);
            animalRepo.adicionarAnimals(animal3, dono1);

            // Internando animais
            internacao.adicionarAnimalInternado(animal2);

            // Dar alta animal
            internacao.darAltaAnimal(animal2);

            // Listando animais cadastrados
            List<Animal> animais = animalRepo.listarAnimais();
            for (Animal animal : animais) {
                System.out.println("Nome: " + animal.getNome() + " - Dono: " + animal.getDono().getNome());
            }

            // Buscando animal pelo id
            Animal animalEncontrado = animalRepo.buscarAnimalsPeloId(1);
            System.out.println("Animal encontrado pelo ID: " + animalEncontrado.getNome());

            // Buscando dono pelo cpf
            Dono donoEncontrado = animalRepo.buscarDonoPeloCpf("123.456.789-10");
            System.out.println("Dono encontrado pelo CPF: " + donoEncontrado.getNome());



            for (Animal animal : internacao.listarAnimaisInternados()) {
                    System.out.println(animal.getNome() + " - " + animal.getDono());
            }

            for (Animal animal : internacao.listarAnimaisAtendidos()) {
                    System.out.println(animal.getNome()+ " - " +animal.getTipo());
            }

    }
}
