package com.zap.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public class Comentario {

    private String descricao;
    private List<Usuario> usuarios = new ArrayList<>();

    public Comentario() {
    }

    public Comentario(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

}
