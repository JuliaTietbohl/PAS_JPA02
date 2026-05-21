package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;


public interface IAutorRepository{
    List<Autor> getAutores();
    Autor getAutorNumero(long numero);
    Autor getAutorNome(String nome);
    Autor getAutorAnoNascimento(int anoNascimento);
    List<Autor> getAutorLivros(Livro livro);
}