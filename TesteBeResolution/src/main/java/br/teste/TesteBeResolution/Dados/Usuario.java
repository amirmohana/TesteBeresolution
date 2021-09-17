package br.teste.TesteBeResolution.Dados;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Usuario extends Carteira implements Serializable{

    private String nome;
    private String email;
    private String id;

    public Usuario(){
        id = UUID.randomUUID().toString();
    }
    public Usuario(String nome, String email, String id){
        super();
        this.nome = nome;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}
