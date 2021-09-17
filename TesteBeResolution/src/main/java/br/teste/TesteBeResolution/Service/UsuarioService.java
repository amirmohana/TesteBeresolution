package br.teste.TesteBeResolution.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.teste.TesteBeResolution.Repository.UsuarioRepository;
import br.teste.TesteBeResolution.Dados.Usuario;

@Transactional
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repo;

    public List<Usuario> listar() {
        return repo.findAll();        
    }
    
    public Usuario obterPeloId(String id) {        
        return repo.getById(id);
    }

    public void deletarPeloId(String id) {
        repo.deleteById(id);
    }

    public Usuario salvarUsuario(Usuario p) {
        return  repo.save(p);        
    }

}
