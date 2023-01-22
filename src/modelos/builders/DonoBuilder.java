package modelos.builders;

import modelos.Dono;
import modelos.Endereco;

public class DonoBuilder {

    private Dono dono;

    public DonoBuilder(){
        this.dono = new Dono();
    }

    public DonoBuilder nome(String nome){
        this.dono.setNome(nome);
        return this;
    }

    public DonoBuilder telefone(String telefone){
        this.dono.setTelefone(telefone);
        return this;
    }

    public DonoBuilder email(String email){
        this.dono.setEmail(email);
        return this;
    }

    public DonoBuilder endereco(Endereco endereco){
        this.dono.setEndereco(endereco);
        return this;
    }
    public DonoBuilder cpf(String cpf){
        this.dono.setCpf(cpf);
        return this;
    }

    public Dono build(){
        return this.dono;
    }
}
