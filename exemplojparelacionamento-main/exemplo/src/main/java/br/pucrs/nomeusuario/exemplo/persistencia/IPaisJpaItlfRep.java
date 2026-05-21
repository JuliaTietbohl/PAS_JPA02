package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IPaisJpaItlfRep extends CrudRepository<Pais,Long>{
    List<Pais> findAll();
    Pais findByCodigo(long codigo);
    Pais findBySigla(String sigla);
    //post?
}

/*retornar todos os países cadastrados
retornar um país pelo seu código
retornar um país pela sua sigla
cadastrar um novo país */