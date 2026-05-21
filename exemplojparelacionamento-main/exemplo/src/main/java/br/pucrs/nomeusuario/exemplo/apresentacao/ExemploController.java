package br.pucrs.nomeusuario.exemplo.apresentacao;

import br.pucrs.nomeusuario.exemplo.persistencia.*;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/biblioteca")
public class ExemploController {
    private IAcervoRepository acervo;
    private IEditoraRepository editoras;
    private IAutorRepository autores;
    private IPaisRepository paises;

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editoras, IAutorRepository autores, IPaisRepository paises) {
        this.acervo = acervo;        
        this.editoras = editoras;
        this.autores = autores;
        this.paises = paises;
    }

    @GetMapping("")
    public String getMensagemInicial() {
        return "Aplicacao Spring-Boot funcionando!";
    }

    @GetMapping("/livros")
    public List<Livro> getLivros() {
        return acervo.getLivros();
    }

    @GetMapping("/livroid/{id}")
    public Livro getLivroTitulo(@PathVariable("id") long id) {
        return acervo.getLivroId(id);
    }

    @GetMapping("/livrosautor/{autor}")
    public List<Livro> getLivrosTitulo(@PathVariable String autor) {
        return acervo.getLivrosAutor(autor);
    }

    @GetMapping("/editoras")
    public List<Editora> getEditoras() {
        return editoras.getEditoras();
    }

    @GetMapping("/editoracod/{codigo}")
    public Editora getEditoraCodigo(@PathVariable("codigo") long codigo) {
        return editoras.getEditoraCodigo(codigo);
    }

    @GetMapping("/editoranome/{nome}")
    public Editora getEditoraNome(@PathVariable String nome) {
        return editoras.getEditoraNome(nome);
    }

    @GetMapping("/autor/{numero}")
    public Autor getAutorLivros(@PathVariable("numero") long numero) {
        return autores.getAutorNumero(numero);
    }

    @GetMapping("/todosautores")
    public List<Autor> getAutores() {
        return autores.getAutores();
    }

    @GetMapping("/paises")
    public List<Pais> getPaises() {
        return paises.getPaises();
    }

    @GetMapping("/paisCod/{codigo}")
    public Pais getPaisCodigo(@PathVariable("codigo") long codigo) {
        return paises.getPaisCodigo(codigo);
    }

    @GetMapping("/paisSigla/{sigla}")
    public Pais getPaisSigla(@PathVariable("sigla") String sigla) {
        return paises.getPaisSigla(sigla);
    }

    @PostMapping("/pais")
    public Boolean addPais(@RequestBody Pais pais) {
        return paises.addPais(pais);
    }

}