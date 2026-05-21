//bidirecional um autor varios livros e livro 1 autor -> 1 Autor : N Livros , entao livros owning side
package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "numero")
public class Autor {
    @Id
    private long numero;
    @OneToMany(mappedBy = "autor")
    private String nome;
    private int anoNascimento;
    private List<Livro> livros;
    private List<Autor> autores;
    
     public Autor() {        
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public long getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public List<Autor> getAutores() {
        return autores;
    }
}