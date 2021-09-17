package br.teste.TesteBeResolution.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.teste.TesteBeResolution.Dados.Carteira;

public interface CarteiraRepository extends JpaRepository <Carteira, String>{
    
}
