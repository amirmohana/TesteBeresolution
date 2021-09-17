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

import br.teste.TesteBeResolution.Dados.Carteira;
import br.teste.TesteBeResolution.Service.CarteiraService;

@RestController
@RequestMapping("/api/Carteira")
public class ControllerCarteira {
    @Autowired
    private CarteiraService service;

    @GetMapping
    public ResponseEntity<List<Carteira>> obterTodos() {
        List<Carteira> obj = service.listar();
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Carteira p) {
         service.salvarEntidade(p);
         return ResponseEntity.status(HttpStatus.CREATED).body(p.getId());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPeloId(@PathVariable("id") String id) {
        service.deletarPeloId(id);
        return ResponseEntity.ok().build();
    } 

    @GetMapping("/{id}")
    public ResponseEntity<Carteira> obterId(@PathVariable("id") String id) {        
        return ResponseEntity.status(HttpStatus.OK).body(service.obterPeloId(id));
    }
}
