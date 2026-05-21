package br.pucrs.nomeusuario.exemplo.persistencia;
import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AutorRepoJpaImpl implements IAutorRepository {
    private IAutorJpaItfRep repository;

    @Autowired
    public AutorRepoJpaImpl(IAutorJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Autor> getAutores() {
        List<Autor> autores = repository.findAll();
        if (autores.size() == 0) 
            autores = new LinkedList<Autor>();
        return autores;
        }

    @Override
    public Autor getAutorNumero(long numero) {
        Autor autor = repository.findByNumero(numero);
        return autor;
    }

    @Override
    public Autor getAutorNome(String nome) {
        Autor autor = repository.findByNome(nome);
        return autor;
    }

    @Override
    public Autor getAutorAnoNascimento(int anoNascimento) {
        Autor autor = repository.findByAnoNascimento(anoNascimento);
        return autor;
    }

    @Override
    public List<Autor> getAutorLivros(Livro livro) {
        List<Autor> autor = repository.findByLivros(livro);
        if (autor.size() == 0)
            autor = new LinkedList<Autor>();
        return autor;
    }
}