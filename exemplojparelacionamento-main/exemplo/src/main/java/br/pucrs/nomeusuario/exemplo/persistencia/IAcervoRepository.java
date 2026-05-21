package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IAcervoRepository {
    List<Livro> getLivros();
    Livro getLivroId(long id);
    List<Livro> getLivrosAutor(String autor);
    List<Autor> getAutores();
    List<Autor> getAutorLivros(Livro livro);
}