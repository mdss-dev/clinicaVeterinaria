package modelos.builders;

import modelos.Endereco;
public class EnderecoBuilder {
    private Endereco endereco;

    public EnderecoBuilder() {
        this.endereco = new Endereco();
    }

    public EnderecoBuilder comRua(String rua) {
        this.endereco.setRua(rua);
        return this;
    }

    public EnderecoBuilder comNumero(String numero) {
        this.endereco.setNumero(numero);
        return this;
    }

    public EnderecoBuilder comBairro(String bairro) {
        this.endereco.setBairro(bairro);
        return this;
    }

    public EnderecoBuilder comCidade(String cidade) {
        this.endereco.setCidade(cidade);
        return this;
    }

    public EnderecoBuilder comEstado(String estado) {
        this.endereco.setEstado(estado);
        return this;
    }

    public EnderecoBuilder comCep(String cep) {
        this.endereco.setCep(cep);
        return this;
    }

    public Endereco build() {
        return this.endereco;
    }
}
