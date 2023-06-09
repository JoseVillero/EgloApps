package com.adsosena.egloapps.repositories;

import com.adsosena.egloapps.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**Interface UsuarioRepository:
 * Esta interface implementa JpaRepository permitiendo heredar sus metodos para su utilizacion.
 * @author Jose David */
@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario,String> {

    Usuario findUsuarioByEmail(String email);

}
