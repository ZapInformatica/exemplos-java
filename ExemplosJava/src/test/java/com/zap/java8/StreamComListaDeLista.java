package com.zap.java8;

import com.zap.model.Comentario;
import com.zap.model.Post;
import com.zap.model.Usuario;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Renato
 */
public class StreamComListaDeLista {

    @Test
    public void deveRetornarTodosOsUsuariosQuemFizeramPost() {
        Post post1 = new Post();

        Usuario joao    = new Usuario("João");
        Usuario maria   = new Usuario("Maria");
        Usuario joaquim = new Usuario("Joaquim");

        Comentario comentarioA = new Comentario("Comentário A");

        comentarioA.getUsuarios().add(joao);
        comentarioA.getUsuarios().add(maria);

        Comentario comentarioB = new Comentario("Comentário B");

        comentarioB.getUsuarios().add(joaquim);

        post1.getComentarios().add(comentarioA);
        post1.getComentarios().add(comentarioB);

        Post post2 = new Post();

        Usuario ana = new Usuario("Ana");

        Comentario comentarioC = new Comentario("Comentário A");
        comentarioC.getUsuarios().add(ana);

        post2.getComentarios().add(comentarioC);

        List<Post> posts = Arrays.asList(post1, post2);

        // Teste
        List<Usuario> usuarios = posts.stream()
                .map(Post::getComentarios)
                .flatMap(Collection::stream)
                .map(Comentario::getUsuarios)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());

        Assert.assertEquals(4, usuarios.size());
    }

}
