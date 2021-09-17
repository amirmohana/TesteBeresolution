package br.teste.TesteBeResolution.Dados;

import java.util.UUID;

import javax.persistence.Entity;

@Entity
public class Carteira {
    private String tipo;
    private int valor;
    private Usuario usuario;
    private String id;

    public Carteira(){
        id = UUID.randomUUID().toString();

    }
    public Carteira(String tipo, int valor, Usuario usuario, String id){
        this();
        this.tipo=tipo;
        this.valor = valor;
        this.usuario = usuario;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
}
