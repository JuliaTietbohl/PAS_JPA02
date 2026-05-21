package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

public interface IPaisRepository {
    List<Pais> getPaises();
    Pais getPaisCodigo(long codigo);
    Pais getPaisSigla(String sigla);
    Boolean addPais(Pais pais);
}
