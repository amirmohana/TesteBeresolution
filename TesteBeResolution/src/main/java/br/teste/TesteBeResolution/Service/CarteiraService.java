package br.teste.TesteBeResolution.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.teste.TesteBeResolution.Dados.Carteira;
import br.teste.TesteBeResolution.Repository.CarteiraRepository;

@Transactional
@Service
public class CarteiraService {
    @Autowired
    private CarteiraRepository repo;

    public List<Carteira> listar() {
        return repo.findAll();        
    }
    
    public Carteira obterPeloId(String id) {        
        return repo.getById(id);
    }

    public void deletarPeloId(String id) {
        repo.deleteById(id);
    }

    public Carteira salvarCarteira(Carteira p) {
        return  repo.save(p);        
    }
}
