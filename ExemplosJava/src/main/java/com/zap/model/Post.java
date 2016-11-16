package com.zap.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renato
 */
public class Post {

    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {
    }

    public Post(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
