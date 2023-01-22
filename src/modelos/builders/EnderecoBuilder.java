package modelos.builders;

import modelos.Endereco;
public class EnderecoBuilder {
    private Endereco endereco;

    public EnderecoBuilder() {
        this.endereco = new Endereco();
    }

    public EnderecoBuilder rua(String rua) {
        this.endereco.setRua(rua);
        return this;
    }

    public EnderecoBuilder numero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    public EnderecoBuilder bairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    public EnderecoBuilder cidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder estado(String estado) {
        this.endereco.setEstado(estado);
        return this;
    }

    public EnderecoBuilder cep(String cep) {
        this.endereco.setCep(cep);
        return this;
    }

    public Endereco build() {
        return this.endereco;
    }
}
