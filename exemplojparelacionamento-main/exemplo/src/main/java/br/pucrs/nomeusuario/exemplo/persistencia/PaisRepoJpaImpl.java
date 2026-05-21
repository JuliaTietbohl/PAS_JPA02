package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class PaisRepoJpaImpl implements IPaisRepository {
    private IPaisJpaItlfRep repository;

    @Autowired
    public PaisRepoJpaImpl(IPaisJpaItlfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Pais> getPaises() {
        List<Pais> paises = repository.findAll();
        if (paises.size() == 0) 
            paises = new LinkedList<Pais>();
        return paises;
    }

    @Override
    public Pais getPaisCodigo(long codigo) {
        Pais pais = repository.findByCodigo(codigo);
        return pais;
    }

    @Override
    public Pais getPaisSigla(String sigla) {
        Pais pais = repository.findBySigla(sigla);
        return pais;    
    }
    

}
