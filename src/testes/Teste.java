package testes;

import modelos.*;
import modelos.builders.*;
import modelos.enuns.*;
import repository.AnimalRepository;
import repository.InternacaoAnimaisRepository;

import static repository.AnimalRepository.*;
import static repository.InternacaoAnimaisRepository.*;

public class Teste {
    public static void main(String[] args) {
            InternacaoAnimaisRepository internacao = new InternacaoAnimaisRepository();

            // Primeiro objeto
            Endereco enderecoDono1 = new EnderecoBuilder()
                    .bairro("Silveira")
                    .cep("33.775-550")
                    .cidade("São Paulo")
                    .estado("SP")
                    .rua("rua Petrolina das Dores")
                    .numero("35 A")
                    .build();
            Dono dono1 = new DonoBuilder()
                    .cpf("111.222.333-01")
                    .nome("José de Almeida")
                    .email("email.teste@gmail.com")
                    .endereco(enderecoDono1)
                    .telefone("33911111111")
                    .build();
            Cachorro animal1 = new CachorroBuilder()
                    .nome("Petruquio")
                    .raca("Xau-xau")
                    .corPelo("caramelo")
                    .castrado(true)
                    .dono(dono1)
                    .idade("3 anos e meio")
                    .estaDoente(true)
                    .sintomas("Não está defecando há 2 dias")
                    .tipo(EnumTipoAnimal.CACHORRO)
                    .tamanho(EnumTamanhoCachorro.TRES)
                    .build();

            //Segundo objeto
            Endereco enderecoDono2 = new EnderecoBuilder()
                    .bairro("Tupi")
                    .cep("43.885-980")
                    .cidade("Belo Horizonte")
                    .estado("MG")
                    .numero("50")
                    .rua("rua Margarida")
                    .build();
            Dono dono2 = new DonoBuilder()
                    .cpf("111.222.333-02")
                    .nome("Amanda Batista")
                    .email("amanda@gmail.com")
                    .endereco(enderecoDono2)
                    .telefone("31922222222")
                    .build();
            Cachorro animal2 = new CachorroBuilder()
                    .nome("Toto")
                    .raca("Bulldog")
                    .corPelo("cinza")
                    .castrado(false)
                    .dono(dono2)
                    .idade("2 anos")
                    .estaDoente(true)
                    .sintomas("Não consegue dormir")
                    .tipo(EnumTipoAnimal.CACHORRO)
                    .tamanho(EnumTamanhoCachorro.DOIS)
                    .build();

            //Terceiro objeto
            Endereco enderecoDono3 = new EnderecoBuilder()
                    .bairro("SIlveira")
                    .cep("33.775-550")
                    .cidade("São Paulo")
                    .estado("SP")
                    .numero("35 A")
                    .rua("rua B")
                    .build();
            Dono dono3 = new DonoBuilder()
                    .cpf("111.222.333-03")
                    .nome("José de Almeida")
                    .email("email.teste@gmail.com")
                    .endereco(enderecoDono3)
                    .telefone("33 3333-3333")
                    .build();
            Gato animal3 = new GatoBuilder()
                    .nome("Nina")
                    .raca("Cianez")
                    .corPelo("branco")
                    .castrado(false)
                    .dono(dono3)
                    .idade("1 ano")
                    .estaDoente(true)
                    .sintomas("Não come há 2 dias")
                    .tipo(EnumTipoAnimal.GATO)
                    .build();

            //Quarto objeto
            Endereco enderecoDono4 = new EnderecoBuilder()
                    .bairro("Jessica")
                    .cep("33.741-880")
                    .cidade("Indaial")
                    .estado("SC")
                    .numero("120")
                    .rua("rua certa")
                    .build();
            Dono dono4 = new DonoBuilder()
                    .cpf("111.222.333-04")
                    .nome("José de Almeida")
                    .email("jose@gmail.com")
                    .endereco(enderecoDono4)
                    .telefone("33944444444")
                    .build();
            Passaro animal4 = new PassaroBuilder()
                    .nome("ZeZe")
                    .raca("Papagaio")
                    .corPenas("verde")
                    .dono(dono3)
                    .idade("2 ano")
                    .estaDoente(false)
                    .sintomas("Não fala há 15 dias")
                    .tipo(EnumTipoAnimal.PASSARO)
                    .build();

            //Quarto objeto
            Passaro animal5 = new PassaroBuilder()
                    .nome("Tuti-tuti")
                    .raca("Trina Ferro")
                    .corPenas("branco")
                    .dono(dono4)
                    .idade("1 ano")
                    .estaDoente(true)
                    .sintomas("Não canta há 5 dias")
                    .tipo(EnumTipoAnimal.PASSARO)
                    .build();

            // Criando animais
            AnimalRepository.atenderAnimal(animal1, dono1);
            AnimalRepository.atenderAnimal(animal2, dono2);
            AnimalRepository.atenderAnimal(animal3, dono3);
            AnimalRepository.atenderAnimal(animal4, dono4);
            AnimalRepository.atenderAnimal(animal5, dono4);

            //Listandos tos os animais que já foram atendidos
            System.out.println("Listandos todos os animais que já foram atendidos");
            listarAnimaisAtendidos();


            // Internando animais
            internacao.adicionarAnimalInternado(animal1);
            internacao.adicionarAnimalInternado(animal2);
            internacao.adicionarAnimalInternado(animal3);
            internacao.adicionarAnimalInternado(animal4); //não está doente

            //Listandos todos os animais que internados
            System.out.println("Listandos todos os animais que estão internados");
            listarAnimaisInternados();

            // Dando alta ao animal
            internacao.darAltaAnimal(animal2);
            internacao.darAltaAnimal(animal3);

            //Listandos todos os animais que internados
            System.out.println("Listandos todos os animais que estão internados");
            listarAnimaisInternados();


            // Buscando animal pelo id
            Animal animalEncontrado = AnimalRepository.buscarAnimalsPeloId(2);
            System.out.println("Animal encontrado pelo ID e atende pelo nome de " +  animalEncontrado.getNome());

            // Buscando dono pelo cpf
            AnimalRepository.buscarDonoPeloCpf("111.222.333-03");

            AnimalRepository.excluirAnimals(4);

            listarAnimaisAtendidos();






    }
}
