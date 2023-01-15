# Crie um sistema para uma clínica veterinária.

## Para isso:

* Crie algumas classes que representam animais, como Cachorro, Gato, Passaro.
  Elas devem ter os seguintes atributos:
- identificador (incrementa a cada novo objeto criado)
- nome.
- dono.
- raca.
- idade.
- estaDoente.

* Crie uma classe que representa um dono.
  Ela deve ter os seguintes atributos:
- identificador (incrementa a cada novo objeto criado)
- nome.
- cpf.
- telefone.
- endereco (Obs: endereco por ser uma outra classe?).
- email.

* Crie uma Classe gerenciadora de animais que atenda as seguintes regras de negócio
  (CRUD -> CREATE, READ, UPDATE, DELETE):
  Sugestão de nome: CachorroRepository, GatoRepository, etc.
- Pode cadastrar um animal.
- Pode alterar um animal.
- Pode excluir um animal.
- Pode listar os animais cadastrados.
- Pode buscar um animal pelo seu identificador.

* Crie uma Classe responsavel pela internação de um animal.
- Essa classe só deve permitir animais doentes.
- Ela deve ser uma unica classe, que permite receber por parametro qualquer animal no metodo de cadastro.
- Essa classe deve ter um metodo de "alta" para dar auta ao animal.
- Ao dar alta, um email deve ser enviado ao dono (pode ser só uma mensagem no console).

* Faça uma classe de testes com um metodo main, para testar todo esse mecanismo.


ITENS QUE SERÃO AVALIADOS:
* Abstração.
* Classes.
* Objetos.
* Construtores.
* Atributos e métodos de objetos ( de instâncias).
* Atributos e métodos de de classes (estaticos).
* Modifcadores de acesso.
* Encapsulamento.
* Herança.
* Polimorfismo.
