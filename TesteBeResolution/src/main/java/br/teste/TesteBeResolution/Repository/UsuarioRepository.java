package br.teste.TesteBeResolution.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.teste.TesteBeResolution.Dados.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, String>{
    
}
