package br.pucrs.nomeusuario.exemplo.persistencia;

import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
public class Pais {
    private long codigo;
    private String nome;
    private String sigla;
    @OneToMany(mappedBy = "pais", cascade = CascadeType.REFRESH)
    private List<Livro> livros;


public Pais() {
}

public Pais(long codigo, String nome, String sigla) {
    this.codigo = codigo;
    this.nome = nome;
    this.sigla = sigla;
}

public String getNome() {
    return nome;
}

public long getCodigo() {
    return codigo;
}

public String getSigla() {
    return sigla;
}

}
