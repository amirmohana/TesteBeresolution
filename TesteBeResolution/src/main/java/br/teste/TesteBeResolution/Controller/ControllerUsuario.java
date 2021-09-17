package br.teste.TesteBeResolution.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.teste.TesteBeResolution.Dados.Usuario;
import br.teste.TesteBeResolution.Service.UsuarioService;


@RestController
@RequestMapping("/api/Usuario")
public class ControllerUsuario {
    @Autowired
    private UsuarioService service;

    @GetMapping
    public ResponseEntity<List<Usuario>> obterTodos() {
        List<Usuario> obj = service.listar();
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Usuario p) {
         service.salvarEntidade(p);
         return ResponseEntity.status(HttpStatus.CREATED).body(p.getId());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPeloId(@PathVariable("id") String id) {
        service.deletarPeloId(id);
        return ResponseEntity.ok().build();
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obterId(@PathVariable("id") String id) {        
        return ResponseEntity.status(HttpStatus.OK).body(service.obterPeloId(id));
    }
}
