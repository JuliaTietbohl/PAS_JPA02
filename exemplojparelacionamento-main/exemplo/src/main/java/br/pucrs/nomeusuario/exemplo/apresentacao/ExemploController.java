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

    @Autowired
    public ExemploController(IAcervoRepository acervo, IEditoraRepository editoras) {
        this.acervo = acervo;        
        this.editoras = editoras;
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
    public List<Autor> getAutorLivros(@PathVariable("l") Livro livro) {
        return acervo.getAutorLivros(livro);
    }

    @GetMapping("/todosautores")
    public List<Autor> getAutores() {
        return acervo.getAutores();
    }

    @GetMapping("/paises")
    public List<Pais> getPaises() {
        return acervo.getPaises();
    }

    @GetMapping("/paisCod/{codigo}")
    public List<Pais> getPaisCodigo(@PathVariable("codigo") long codigo) {
        return acervo.getPaisCodigo(codigo);
    }

    @GetMapping("/paisSigla/{sigla}")
    public List<Pais> getPaisSigla(@PathVariable("sigla") String sigla) {
        return acervo.getPaisSigla(sigla);
    }
    
}