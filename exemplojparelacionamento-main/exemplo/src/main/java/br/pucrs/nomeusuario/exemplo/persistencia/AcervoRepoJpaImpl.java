package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.LinkedList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AcervoRepoJpaImpl implements IAcervoRepository {
    private IAcervoJpaItfRep acervoRepository;
    private IAutorJpaItfRep autorRepository;

    @Autowired
    public AcervoRepoJpaImpl(IAcervoJpaItfRep acervoRepository, IAutorJpaItfRep autorRepository) {
        this.acervoRepository = acervoRepository;
        this.autorRepository = autorRepository;
    }

    @Override
    public List<Livro> getLivros() {
        List<Livro> livros = acervoRepository.findAll();
        if (livros.size() == 0) 
            livros = new LinkedList<Livro>();
        return livros;
    }

    @Override
    public Livro getLivroId(long id) {
        Livro livro = acervoRepository.findById(id);
        return livro;
    }

    @Override
    public List<Livro> getLivrosAutor(String autor) {
        List<Livro> livros = acervoRepository.findByAutorNome(autor);
        if (livros.size() == 0) 
            livros = new LinkedList<Livro>();
        return livros;
    }

    @Override
    public List<Autor> getAutorLivros(Livro livro) {
        List<Autor> autor = autorRepository.findByLivros(livro);
        if (autor.size() == 0)
            autor = new LinkedList<Autor>();
        return autor;
    }

    @Override
    public List<Autor> getAutores() {
        List<Autor> autores = autorRepository.findAll();
        if (autores.size() == 0) 
            autores = new LinkedList<Autor>();
        return autores;
        }

    @Override
    public List<Pais> getPaises() {
        List<Pais> paises = repository.findAllPaises();
        if (paises.size() == 0) 
            paises = new LinkedList<Pais>();
        return paises;
    }

    @Override
    public List<Pais> getPaisCodigo(long codigo) {
        List<Pais> pais = repository.findByCodigo(codigo);
        if (pais.size() == 0)
            pais = new LinkedList<Pais>();
        return pais;
    }

    @Override
    public List<Pais> getPaisSigla(String sigla) {
        List<Pais> pais = repository.findBySigla(sigla);
        if (pais.size() == 0)
            pais = new LinkedList<Pais>();
        return pais;
    }
    

}